package OA_Model.src.example;

import mypackage.ModeDateServiceLocator;
import mypackage.ModeDateServicePortType;

public class OAClient {
    public static void main(String[] argv) {
        try {
            ModeDateServiceLocator modeDateServiceLocator = new ModeDateServiceLocator();
            ModeDateServicePortType modeDateServiceHttpPort = modeDateServiceLocator.getModeDateServiceHttpPort();
            String modeid = "9501";
            String khmc = "MYCIM系统提醒";
            String dataid = "";
            String doPageexpandInterface = "Y";
            String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
            xml += "<ROOT>";
            xml += "<header>";
            xml += "<userid>1</userid>";//用户id
            xml += "<modeid>" + modeid + "</modeid>";//模块id
            xml += "<doPageexpandInterface>" + doPageexpandInterface + "</doPageexpandInterface>";//是否执行页面扩展接口动作   Y 执行  N 不执行  （数据为新建的时候，执行新建保存的接口；数据为修改的时候，执行编辑保存的接口。）
            xml += "<id>" + dataid + "</id>";//billid 如果是新增则值为空   如果有数据则为修改
            xml += "</header>";
            xml += "<search>";
            xml += "<condition />";
            xml += "<right>N</right>";//是否验证权限
            xml += "</search>";
            xml += "<data id=\"\">";
            xml += "<maintable>";

            xml += "<field>";
            xml += "<filedname>xtb</filedname>";//数据库名称
            xml += "<filedlabel>xtb</filedlabel>";//字段名称  系统别
            xml += "<fileddbtype>NUMBER(38,0)</fileddbtype>";//数据库类型
            xml += "<filedvalue>" + 2 + "</filedvalue>";//字段的值
            xml += "<fieldshowname>名称</fieldshowname>";
            xml += "</field>";

            xml += "<field>";
            xml += "<filedname>yjxx</filedname>";//数据库名称
            xml += "<filedlabel>yjxx</filedlabel>";//字段名称  预警信息
            xml += "<fileddbtype>VARCHAR2(999 BYTE)</fileddbtype>";//数据库类型
            xml += "<filedvalue>" + khmc + "</filedvalue>";//字段的值
            xml += "<fieldshowname>名称</fieldshowname>";
            xml += "</field>";

            xml += "<field>";
            xml += "<filedname>txry</filedname>";//数据库名称
            xml += "<filedlabel>txry</filedlabel>";//字段名称  提醒人员
            xml += "<fileddbtype>CLOB</fileddbtype>";//数据库类型
            xml += "<filedvalue>" + "110,504" + "</filedvalue>";//字段的值
            xml += "<fieldshowname>名称</fieldshowname>";
            xml += "</field>";

            xml += "<field>";
            xml += "<filedname>txsj</filedname>";//数据库名称
            xml += "<filedlabel>txsj</filedlabel>";//字段名称  提醒时间
            xml += "<fileddbtype>VARCHAR2(100 BYTE)</fileddbtype>";//数据库类型
            xml += "<filedvalue>" + "2022-03-21 14:41:00" + "</filedvalue>";//字段的值
            xml += "<fieldshowname>名称</fieldshowname>";
            xml += "</field>";
            xml += "</maintable>";
            xml += "</data>";
            xml += "</ROOT>";

            String result = modeDateServiceHttpPort.saveModeData(xml);
            System.out.println(result);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
