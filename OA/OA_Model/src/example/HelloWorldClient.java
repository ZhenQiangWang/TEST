package example;

import mypackage.ModeDateServiceLocator;
import mypackage.ModeDateServicePortType;

public class HelloWorldClient {
    public static void main(String[] argv) {
        try {
            ModeDateServiceLocator modeDateServiceLocator = new ModeDateServiceLocator();
            ModeDateServicePortType modeDateServiceHttpPort = modeDateServiceLocator.getModeDateServiceHttpPort();
            String modeid = "9501";
            String khmc = "接口测试调用消息提醒";
            String dataid = "1";
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
            xml += "<right>Y</right>";//是否验证权限
            xml += "</search>";
            xml += "<data id=\"\">";
            xml += "<maintable>";
            xml += "<field>";
            xml += "<filedname>uf_tyxxts</filedname>";//数据库名称
            xml += "<filedlabel>xtb</filedlabel>";//字段名称
            xml += "<fileddbtype>varchar(256)</fileddbtype>";//数据库类型
            xml += "<filedvalue>" + khmc + "</filedvalue>";//字段的值
            xml += "<fieldshowname>名称</fieldshowname>";
            xml += "</field>";
            xml += "<files>";
            xml += "<filedname>file1</filedname>";//数据库名称
            xml += "<file>";
            xml += "<filename>w.doc</filename>";//附件名字
            xml += "<filecontent>http://www.badiu.com/1.zip</filecontent>";//附件url
            xml += "</file>";
            xml += "<file>";
            xml += "<filename>w2.doc</filename>";//附件名字
            xml += "<filecontent>http://www.badiu.com/2.zip</filecontent>";//附件url
            xml += "</file>";
            xml += "</files>";
            xml += "</maintable>";
            xml += "<detail>";
            xml += "<detailtable id='0'>";//id为明细表序号  第一个从0开始
            /* row元素
             * action有3个选项  1.add新增  2.update修改 3.delete删除
             * id为数据的id字段的值  当action为 update/delete时有效
             * */
            xml += "<row id='1' action='add'>";
            xml += "<field>";
            xml += "<filedname>no</filedname>";//数据库名称
            xml += "<filedlabel>编号</filedlabel>";//字段名称
            xml += "<fileddbtype>varchar(256)</fileddbtype>";//数据库类型
            xml += "<filedvalue>" + khmc + "</filedvalue>";//字段的值
            xml += "<fieldshowname>编号</fieldshowname>";
            xml += "</field>";
            xml += "<field>";
            xml += "<filedname>name</filedname>";//数据库名称
            xml += "<filedlabel>名称</filedlabel>";//字段名称
            xml += "<fileddbtype>varchar(256)</fileddbtype>";//数据库类型
            xml += "<filedvalue>" + khmc + "</filedvalue>";//字段的值
            xml += "<fieldshowname>名称</fieldshowname>";
            xml += "</field>";
            xml += "<files>";
            xml += "<filedname>file1</filedname>";//数据库名称
            xml += "<file>";
            xml += "<filename>w.doc</filename>";//附件名字
            xml += "<filecontent>http://www.badiu.com/1.zip</filecontent>";//附件url
            xml += "</file>";
            xml += "<file>";
            xml += "<filename>w2.doc</filename>";//附件名字
            xml += "<filecontent>http://www.badiu.com/2.zip</filecontent>";//附件url
            xml += "</file>";
            xml += "</files>";
            xml += "</row>";
            xml += "</detailtable>";
            xml += "</detail>";
            xml += "</data>";
            xml += "</ROOT>";

            modeDateServiceHttpPort.saveModeData();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
