import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.util.JSONUtils;

import java.util.ArrayList;
import java.util.HashMap;

public class JSON {
    public static void main(String[] args) {
//        HashMap<String, String> map = new HashMap<>();
//        map.put("itemId","M0506A00001");
//        map.put("orderNo","1660629858526");
//        map.put("returnInfo","批号：2003001；唯一码：CKS1CX0301574；数量：1.0；退料人员：ADMIN；退料日期：2022/08/16；备注：测试↵批号：2006001；唯一码：CKS1CX0301575；数量：2.0；退料人员：ADMIN；退料日期：2022/08/16；备注：测试↵批号：2101001；唯一码：CKS1CX0301622；数量：3.0；退料人员：ADMIN；退料日期：2022/08/16；备注：测试↵");
//        ArrayList<Object> data = new ArrayList<>();
//        data.add(map);

        ArrayList<TransReturnCancelVO> transReturnCancelVOS = new ArrayList<>();
        TransReturnCancelVO transReturnCancelVO = new TransReturnCancelVO();
        transReturnCancelVO.setItemId("M0506A00001");
        transReturnCancelVO.setOrderNo("1660629858526");
        transReturnCancelVO.setReturnInfo("returnInfo\",\"批号：2003001；唯一码：CKS1CX0301574；数量：1.0；退料人员：ADMIN；退料日期：2022/08/16；备注：测试↵批号：2006001；唯一码：CKS1CX0301575；数量：2.0；退料人员：ADMIN；退料日期：2022/08/16；备注：测试↵批号：2101001；唯一码：CKS1CX0301622；数量：3.0；退料人员：ADMIN；退料日期：2022/08/16；备注：测试↵");
        transReturnCancelVOS.add(transReturnCancelVO);

        TransReturnCancelVO transReturnCancelVO1 = new TransReturnCancelVO();
        transReturnCancelVO1.setItemId("M0506A00001");
        transReturnCancelVO1.setOrderNo("1660629858526");
        transReturnCancelVO1.setReturnInfo("1545");
        transReturnCancelVOS.add(transReturnCancelVO1);

        layUIResultVO ok = layUIResultVO.ok(1, transReturnCancelVOS);
        JSONObject jsonObject = JSONObject.fromObject(ok,  new JsonConfig());
        String s = jsonObject.toString();
        System.out.println("5231");
    }
}
