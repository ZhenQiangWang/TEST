import com.alibaba.fastjson.JSONException;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;

import java.util.Iterator;

public class JsonToXML {
    public static void main(String[] args) {
        /*String str = "{\n" +
                "    \"request\": {\n" +
                "        \"access\": {\n" +
                "            \"appdevice\": {\n" +
                "                \"appid\": \"Dynax\",\n" +
                "                \"appmodule\": \"\",\n" +
                "                \"timestamp\": \"2021-11-30 10:34:46\"\n" +
                "            },\n" +
                "            \"authentication\": {\n" +
                "                \"password\": \"tiptop\",\n" +
                "                \"user\": \"tiptop\"\n" +
                "            },\n" +
                "            \"connection\": {\n" +
                "                \"application\": \"application\",\n" +
                "                \"source\": \"source\"\n" +
                "            },\n" +
                "            \"locale\": {\n" +
                "                \"language\": \"zh_CN\"\n" +
                "            },\n" +
                "            \"organization\": {\n" +
                "                \"name\": \"营运中心\"\n" +
                "            }\n" +
                "        },\n" +
                "        \"requestContent\": {\n" +
                "            \"parameter\": {\n" +
                "                \"record\": {\n" +
                "                    \"document\": {\n" +
                "                        \"recordSet\": {\n" +
                "                            \"detail\": {\n" +
                "                                \"name\": \"Detail-A\",\n" +
                "                                \"record\": [{\n" +
                "                                        \"field\": [{\n" +
                "                                                \"name\": \"formid\",\n" +
                "                                                \"value\": \"KSWOE-191200992021/11/30 10:34:46-D1953003\"\n" +
                "                                            }, {\n" +
                "                                                \"name\": \"srg16\",\n" +
                "                                                \"value\": \"KSWOE-19120099\"\n" +
                "                                            }, {\n" +
                "                                                \"name\": \"srg03\",\n" +
                "                                                \"value\": \"01.01.01.30222R\"\n" +
                "                                            }, {\n" +
                "                                                \"name\": \"srgud02\",\n" +
                "                                                \"value\": \"FQA\"\n" +
                "                                            }, {\n" +
                "                                                \"name\": \"srg04\",\n" +
                "                                                \"value\": \"100.0\"\n" +
                "                                            }, {\n" +
                "                                                \"name\": \"srg05\",\n" +
                "                                                \"value\": \"100.0\"\n" +
                "                                            }, {\n" +
                "                                                \"name\": \"srg10\",\n" +
                "                                                \"value\": \"539823000\"\n" +
                "                                            }, {\n" +
                "                                                \"name\": \"srg19\",\n" +
                "                                                \"value\": \"539823000\"\n" +
                "                                            }\n" +
                "                                        ]\n" +
                "                                    }\n" +
                "                                ]\n" +
                "                            },\n" +
                "                            \"id\": \"1\",\n" +
                "                            \"master\": {\n" +
                "                                \"name\": \"Master\",\n" +
                "                                \"record\": {\n" +
                "                                    \"field\": [{\n" +
                "                                            \"name\": \"formid\",\n" +
                "                                            \"value\": \"null2021/11/30 10:34:46\"\n" +
                "                                        }, {\n" +
                "                                            \"name\": \"status\",\n" +
                "                                            \"value\": \"1\"\n" +
                "                                        }, {\n" +
                "                                            \"name\": \"srf01\"\n" +
                "                                        }, {\n" +
                "                                            \"name\": \"srf02\",\n" +
                "                                            \"value\": \"2021/11/30 10:34:46\"\n" +
                "                                        }, {\n" +
                "                                            \"name\": \"srforiu\",\n" +
                "                                            \"value\": \"ADMIN\"\n" +
                "                                        }\n" +
                "                                    ]\n" +
                "                                }\n" +
                "                            }\n" +
                "                        }\n" +
                "                    }\n" +
                "                }\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "}\n";*/
//        String str = "{\"materialId\":\"料号\",\"QTY\":10.0,\"lotNumber\":\"物料批次号\",\"billId\":\"调拨单号\",\"expirationDate\":\"失效日期dd/MM/yyyy\",\"waferId\":\"waferId\",\"trayId\":[\"tray1\",\"tray2\"],\"trnflinwarehouse\":\"拨出仓库\",\"comments\":\"\"}";
        String str = "\n" +
                "\n" +
                "{\n" +
                "    \"canEdit\": \"\", \n" +
                "    \"canView\": \"\", \n" +
                "    \"createTime\": \"\", \n" +
                "    \"creatorId\": \"504\", \n" +
                "    \"creatorName\": \"\", \n" +
                "    \"currentNodeId\": \"\", \n" +
                "    \"currentNodeName\": \"\", \n" +
                "    \"forwardButtonName\": \"\", \n" +
                "    \"isnextflow\": \"\", \n" +
                "    \"lastOperateTime\": \"\", \n" +
                "    \"lastOperatorName\": \"\", \n" +
                "    \"messageType\": \"\", \n" +
                "    \"mustInputRemark\": \"\", \n" +
                "    \"needAffirmance\": \"\", \n" +
                "    \"receiveTime\": \"\", \n" +
                "    \"rejectButtonName\": \"\", \n" +
                "    \"remark\": \"\", \n" +
                "    \"requestId\": \"\", \n" +
                "    \"requestLevel\": \"\", \n" +
                "    \"requestName\": \"核价\", \n" +
                "    \"secLevel\": \"\", \n" +
                "    \"status\": \"\", \n" +
                "    \"subbackButtonName\": \"\", \n" +
                "    \"submitButtonName\": \"\", \n" +
                "    \"subnobackButtonName\": \"\", \n" +
                "    \"workflowBaseInfo\": {\n" +
                "        \"workflowId\": \"32021\", \n" +
                "        \"workflowName\": \"apmi255/apmi265\"\n" +
                "    }, \n" +
                "    \"workflowMainTableInfo\": {\n" +
                "        \"tableDBName\": \"formtable_main_182\", \n" +
                "        \"requestRecords\": [\n" +
                "            {\n" +
                "                \"WorkflowRequestTableRecord\": {\n" +
                "                    \"recordOrder\": \"1\", \n" +
                "                    \"workflowRequestTableFields\": [\n" +
                "                        {\n" +
                "                            \"WorkflowRequestTableField\": {\n" +
                "                                \"edit\": \"true\", \n" +
                "                                \"fieldName\": \"hjdh\", \n" +
                "                                \"fieldValue\": \"P001-21110005\", \n" +
                "                                \"view\": \"true\"\n" +
                "                            }\n" +
                "                        }, \n" +
                "                        {\n" +
                "                            \"WorkflowRequestTableField\": {\n" +
                "                                \"edit\": \"true\", \n" +
                "                                \"fieldName\": \"hjrq\", \n" +
                "                                \"fieldValue\": \"2021-11-11 00:00:00\", \n" +
                "                                \"view\": \"true\"\n" +
                "                            }\n" +
                "                        }, \n" +
                "                        {\n" +
                "                            \"WorkflowRequestTableField\": {\n" +
                "                                \"edit\": \"true\", \n" +
                "                                \"fieldName\": \"gysbm\", \n" +
                "                                \"fieldValue\": \"11.00340\", \n" +
                "                                \"view\": \"true\"\n" +
                "                            }\n" +
                "                        }, \n" +
                "                        {\n" +
                "                            \"WorkflowRequestTableField\": {\n" +
                "                                \"view\": \"true\", \n" +
                "                                \"fieldValue\": \"N\", \n" +
                "                                \"fieldName\": \"fljj\", \n" +
                "                                \"edit\": \"true\"\n" +
                "                            }\n" +
                "                        }, \n" +
                "                        {\n" +
                "                            \"WorkflowRequestTableField\": {\n" +
                "                                \"view\": \"true\", \n" +
                "                                \"fieldValue\": \"N00002\", \n" +
                "                                \"fieldName\": \"sqr\", \n" +
                "                                \"edit\": \"true\"\n" +
                "                            }\n" +
                "                        }, \n" +
                "                        {\n" +
                "                            \"WorkflowRequestTableField\": {\n" +
                "                                \"view\": \"true\", \n" +
                "                                \"fieldValue\": \"2\", \n" +
                "                                \"fieldName\": \"jglx\", \n" +
                "                                \"edit\": \"true\"\n" +
                "                            }\n" +
                "                        }, \n" +
                "                        {\n" +
                "                            \"WorkflowRequestTableField\": {\n" +
                "                                \"view\": \"true\", \n" +
                "                                \"fieldValue\": \"DX\", \n" +
                "                                \"fieldName\": \"ssyyzx\", \n" +
                "                                \"edit\": \"true\"\n" +
                "                            }\n" +
                "                        }, \n" +
                "                        {\n" +
                "                            \"WorkflowRequestTableField\": {\n" +
                "                                \"view\": \"true\", \n" +
                "                                \"fieldValue\": \"2\", \n" +
                "                                \"fieldName\": \"jglx\", \n" +
                "                                \"edit\": \"true\"\n" +
                "                            }\n" +
                "                        }\n" +
                "                    ]\n" +
                "                }\n" +
                "            }\n" +
                "        ]\n" +
                "    }, \n" +
                "    \"workflowDetailTableInfos\": [\n" +
                "        {\n" +
                "            \"WorkflowDetailTableInfo\": {\n" +
                "                \"tableDBName\": \"formtable_main_182_dt1\", \n" +
                "                \"workflowRequestTableRecords\": [\n" +
                "                    {\n" +
                "                        \"WorkflowRequestTableRecord\": {\n" +
                "                            \"recordOrder\": \"1\", \n" +
                "                            \"workflowRequestTableFields\": [\n" +
                "                                {\n" +
                "                                    \"WorkflowRequestTableField\": {\n" +
                "                                        \"edit\": \"true\", \n" +
                "                                        \"fieldName\": \"ljbh\", \n" +
                "                                        \"fieldValue\": \"M0101A0020\", \n" +
                "                                        \"view\": \"true\"\n" +
                "                                    }\n" +
                "                                }, \n" +
                "                                {\n" +
                "                                    \"WorkflowRequestTableField\": {\n" +
                "                                        \"edit\": \"true\", \n" +
                "                                        \"fieldName\": \"pm\", \n" +
                "                                        \"fieldValue\": \"6inch SiC\", \n" +
                "                                        \"view\": \"true\"\n" +
                "                                    }\n" +
                "                                }, \n" +
                "                                {\n" +
                "                                    \"WorkflowRequestTableField\": {\n" +
                "                                        \"edit\": \"true\", \n" +
                "                                        \"fieldName\": \"gg\", \n" +
                "                                        \"fieldValue\": \"4H/500um/SEMI\", \n" +
                "                                        \"view\": \"true\"\n" +
                "                                    }\n" +
                "                                }, \n" +
                "                                {\n" +
                "                                    \"WorkflowRequestTableField\": {\n" +
                "                                        \"view\": \"true\", \n" +
                "                                        \"edit\": \"true\", \n" +
                "                                        \"fieldName\": \"sqdj\", \n" +
                "                                        \"fieldValue\": \"0.000000\"\n" +
                "                                    }\n" +
                "                                }, \n" +
                "                                {\n" +
                "                                    \"WorkflowRequestTableField\": {\n" +
                "                                        \"view\": \"true\", \n" +
                "                                        \"edit\": \"true\", \n" +
                "                                        \"fieldName\": \"hsdj\", \n" +
                "                                        \"fieldValue\": \"0.000000\"\n" +
                "                                    }\n" +
                "                                }, \n" +
                "                                {\n" +
                "                                    \"WorkflowRequestTableField\": {\n" +
                "                                        \"edit\": \"true\", \n" +
                "                                        \"fieldName\": \"jjdw\", \n" +
                "                                        \"fieldValue\": \"\", \n" +
                "                                        \"view\": \"true\"\n" +
                "                                    }\n" +
                "                                }, \n" +
                "                                {\n" +
                "                                    \"WorkflowRequestTableField\": {\n" +
                "                                        \"view\": \"true\", \n" +
                "                                        \"edit\": \"true\", \n" +
                "                                        \"fieldName\": \"sxrq\", \n" +
                "                                        \"fieldValue\": \"2021-11-11 00:00:00\"\n" +
                "                                    }\n" +
                "                                }\n" +
                "                            ]\n" +
                "                        }\n" +
                "                    }\n" +
                "                ]\n" +
                "            }\n" +
                "        }\n" +
                "    ]\n" +
                "}\n" +
                "\n";
//        String str = "{\"comments\": \"\"}";
        JSONObject jsonObject = new JSONObject(str);
        String s = toString(jsonObject, null);
        String s1 = XML.toString(jsonObject);
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s1);
    }

    public static String toString(Object object, String tagName) throws JSONException {
        StringBuilder sb = new StringBuilder();
        JSONArray ja;
        Iterator var9;
        Object val;
        if (!(object instanceof JSONObject)) {
            if (object != null) {
                if (object.getClass().isArray()) {
                    object = new JSONArray(object);
                }

                if (object instanceof JSONArray) {
                    ja = (JSONArray)object;
                    var9 = ja.iterator();

                    while(var9.hasNext()) {
                        val = var9.next();
                        sb.append(toString(val, tagName == null ? "array" : tagName));
                    }

                    return sb.toString();
                }
            }

            String string = object == null ? "null" : escape(object.toString());
//            return tagName == null ? "\"" + string + "\"" : (string.length() == 0 ? "<" + tagName + "/>" : "<" + tagName + ">" + string + "</" + tagName + ">");
            return tagName == null ? "\"" + string + "\"" : ("<" + tagName + ">" + string + "</" + tagName + ">");
        } else {
            if (tagName != null) {
                sb.append('<');
                sb.append(tagName);
                sb.append('>');
            }

            JSONObject jo = (JSONObject)object;
            Iterator keys = jo.keys();

            while(true) {
                while(true) {
                    while(keys.hasNext()) {
                        String key = (String)keys.next();
                        Object value = jo.opt(key);
                        if (value == null) {
                            value = "";
                        } else if (value.getClass().isArray()) {
                            value = new JSONArray(value);
                        }

                        String var10000;
                        if (value instanceof String) {
                            var10000 = (String)value;
                        } else {
                            var10000 = null;
                        }

                        if ("content".equals(key)) {
                            if (value instanceof JSONArray) {
                                ja = (JSONArray)value;
                                int i = 0;

                                for(Iterator var13 = ja.iterator(); var13.hasNext(); ++i) {
                                    Object val123 = var13.next();
                                    if (i > 0) {
                                        sb.append('\n');
                                    }

                                    sb.append(escape(val123.toString()));
                                }
                            } else {
                                sb.append(escape(value.toString()));
                            }
                        } else if (value instanceof JSONArray) {
                            ja = (JSONArray)value;
                            var9 = ja.iterator();

                            while(var9.hasNext()) {
                                val = var9.next();
                                if (val instanceof JSONArray) {
                                    sb.append('<');
                                    sb.append(key);
                                    sb.append('>');
                                    sb.append(toString(val));
                                    sb.append("</");
                                    sb.append(key);
                                    sb.append('>');
                                } else {
                                    sb.append(toString(val, key));
                                }
                            }
                        } /*else if ("".equals(value)) {
                            sb.append('<');
                            sb.append(key);
                            sb.append("/>");
                        } */else {
                            sb.append(toString(value, key));
                        }
                    }

                    if (tagName != null) {
                        sb.append("</");
                        sb.append(tagName);
                        sb.append('>');
                    }

                    return sb.toString();
                }
            }
        }
    }


    public static String toString(Object object) throws org.json.JSONException {
        return toString(object, (String)null);
    }


    /**
     *
     * @param object
     * @param tagName 节点名
     * @param attributeName
     * @return
     */
    public static String ObjectToXml(Object object, String tagName , String attributeName){
        StringBuilder sb = new StringBuilder();
        if (!(object instanceof JSONObject)) {
            //说明已经到是属性值
            String string = object == null ? "null" : escape(object.toString());
            return "<" + tagName + " " ;
        }else {
            //各节点
            if (tagName != null) {
                sb.append('<');
                sb.append(tagName);
            }
            JSONObject jo = (JSONObject)object;
            Iterator keys = jo.keys();
            return null;
        }
    }

    public static String escape(String string) {
        StringBuilder sb = new StringBuilder(string.length());
        int i = 0;

        for(int length = string.length(); i < length; ++i) {
            char c = string.charAt(i);
            switch(c) {
                case '"':
                    sb.append("&quot;");
                    break;
                case '&':
                    sb.append("&amp;");
                    break;
                case '\'':
                    sb.append("&apos;");
                    break;
                case '<':
                    sb.append("&lt;");
                    break;
                case '>':
                    sb.append("&gt;");
                    break;
                default:
                    sb.append(c);
            }
        }

        return sb.toString();
    }
}
