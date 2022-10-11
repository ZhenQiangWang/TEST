import net.sf.json.util.JSONUtils;

public class test {
    public static void main(String[] args) {
        Object[] objects = {};
        StringBuilder sqlStr = new StringBuilder();
        //MOVEOUT
        String value = "select max(TRANS_END_TIMESTAMP) transTime from transaction_log tr,lot_trans_history lt,named_object nb,lot_step_history lst " +
                "where lt.trans_id = ${TYPE}$ " +
                "and nb.instance_id = 'TR' and nb.object = 'OPERATION'and tr.trans_rrn = lt.trans_rrn and lst.lot_rrn = lt.lot_rrn and lst.operation_rrn = nb.instance_rrn " +
                "and lst.lot_id = ${LOT_ID}$";
        String[] split = value.split("\\$");
        for(String str : split){
            if(str.contains("{")){
                System.out.println(str);
                String param = getParam(str.replace("{","").replace("}","").toUpperCase());
                sqlStr.append("'");
                sqlStr.append(param);
                sqlStr.append("'");
            }else {
                sqlStr.append(str);
            }
        }
        System.out.println(sqlStr);
    }

    private static String getParam(String param){
        String val = "";
        if(param.equals("LOT_ID")){
           return  "D2203002";
        }else if(param.equals("TYPE")){
            return "MOVEOUT";
        }else {
            return "123";
        }
    }
}


