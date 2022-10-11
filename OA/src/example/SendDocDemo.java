package example;

import org.apache.axis.encoding.Base64;
import java.io.*;
import java.util.zip.ZipInputStream;

public class SendDocDemo {
    public String getDocInfo(String docid) throws Exception {
        RecordSet rs = new RecordSet();
        String uploadBuffer="";//base64字符串
        String sql = " select b.filerealpath,b.iszip,b.imagefilename,b.imagefileid from  "
                + " imagefile b  where b.imagefileid in(select max(imagefileid) "
                + "from docimagefile where docid in("
                + docid
                + ") group by docid)";
        rs.execute(sql);
        if(rs.next()){
            String filerealpath = Util.null2String(rs.getString("filerealpath"));
            String iszip = Util.null2String(rs.getString("iszip"));
            String imagefilename = Util.null2String(rs.getString("imagefilename"));//文件名
            InputStream fi = getFile(filerealpath,iszip);


            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int count = 0;
            while((count = fi.read(buffer)) >= 0){
                baos.write(buffer, 0, count);
            }
            uploadBuffer = Base64.encode(baos.toByteArray());
            baos.close();
            //这里就可以封装 文件名和文件内容 传给第三方系统
        }
        return  uploadBuffer;

    }
    /**
     * 根据系统文档存放路径 获取文档流
     * @param filerealpath 文档存放路径
     * @param iszip 是否压缩包
     * @return
     * @throws Exception
     */
    private InputStream getFile(String filerealpath, String iszip)
            throws Exception {
        ZipInputStream zin = null;
        InputStream imagefile = null;
        File thefile = new File(filerealpath);
        if (iszip.equals("1")) {
            zin = new ZipInputStream(new FileInputStream(thefile));
            if (zin.getNextEntry() != null)
                imagefile = new BufferedInputStream(zin);
        } else {
            imagefile = new BufferedInputStream(new FileInputStream(thefile));
        }
        return imagefile;
    }
}
