package example;

import com.alibaba.fastjson.JSON;
import mypackage.AutoTrackOutServiceServiceLocator;
import mypackage.AutoTrackOutService_PortType;

import java.util.ArrayList;
import java.util.List;

public class AutoTrackOutService {
  public static void main(String[] argv) {
    try {
      AutoTrackOutServiceServiceLocator autoTrackOutServiceServiceLocator = new AutoTrackOutServiceServiceLocator();
      AutoTrackOutService_PortType autoTrackOutService = autoTrackOutServiceServiceLocator.getAutoTrackOutService();
      AutoTrackOutDTO autoTrackOutDTO = new AutoTrackOutDTO();
      autoTrackOutDTO.setLotId("D2224006");
      autoTrackOutDTO.setOperId("ADMIN");
//      autoTrackOutDTO.setEqpId("PTDT01_EQC");
      autoTrackOutDTO.setEqpId("PMLM01");
//      autoTrackOutDTO.setEqpId("PPPS02");
//      autoTrackOutDTO.setMaterialBoxBarCode("123");
//      autoTrackOutDTO.setRemark("测试");

//      List<data> data = new ArrayList<>();
//      data data1 = new data();
//      data1.setParameter();

      List<outputList> outputLists = new ArrayList<>();
      List<materialInfo> materialInfos = new ArrayList<>();
      outputList outputList1 = new outputList();
      outputList1.setType("Normal");
      outputList1.setOutput("458");
      outputList outputList2 = new outputList();
      outputList2.setType("RT");
      outputList2.setOutput("2");
//      List<reasonList> reasonLists1 = new ArrayList<>();
//      reasonList reasonList = new reasonList();
//      reasonList.setReasonQty("1");
//      reasonList.setCodeType("loss");
//      reasonList.setReasonCode("LOSS_CODE_FOR_WB043");
//      reasonList.setReasonDesc("WB43：首件消耗");
//      /*List<String> sns2 = new ArrayList<>();
//      sns2.add("1");
//      sns2.add("2");*/
//      reasonList.setReasonSN(null);
//      reasonLists1.add(reasonList);

      /*reasonList reasonList3 = new reasonList();
      List<String> sns1 = new ArrayList<>();
      sns1.add("3");
      sns1.add("4");
      reasonList3.setReasonSN(sns1);
      reasonList3.setReasonQty("2");
      reasonList3.setCodeType("loss");
      reasonList3.setReasonCode("BIN3");
      reasonList3.setReasonDesc("AT20：管壳划伤");
      reasonLists1.add(reasonList3);*/
//      outputList1.setReasonList(reasonLists1);
      outputLists.add(outputList1);
//      outputLists.add(outputList2);
      /*reasonList reasonList1 = new reasonList();
      reasonList1.setReasonQty("1");
      reasonList1.setCodeType("loss");
      reasonList1.setReasonCode("LOSS_CODE_FOR_0021");
      reasonList1.setReasonDesc("AT21：Lead变形");
      reasonLists1.add(reasonList1);
      outputList1.setReasonList(reasonLists1);*/

//      materialInfo materialInfo = new materialInfo();
//      materialInfo.setMaterialNo("DECBCA00371");
//      List<materialList> materialLists = new ArrayList<>();
//      materialList materialList = new materialList();
//      materialList.setMaterialLotNo("CKS1CX0302129");
//      materialList.setMaterialQty("8");
//      materialLists.add(materialList);
//      materialInfo.setMaterialList(materialLists);
//      materialInfos.add(materialInfo);



      /*materialInfo materialInfo2 = new materialInfo();
      materialInfo2.setMaterialNo("M0507A00010");
      List<materialList> materialLotInfos2 = new ArrayList<>();

      materialList materialList2 = new materialList();
      materialList2.setMaterialLotNo("CKS1CV6700001");
      materialList2.setMaterialQty("25");
      materialLotInfos2.add(materialList2);


      materialInfo2.setMaterialList(materialLotInfos2);
      materialInfos.add(materialInfo2);*/
      /*outputList1.setMaterialInfo(materialInfos);


      outputList outputList2 = new outputList();
      outputList2.setType("RT");
      outputList2.setOutput("2");
      List<reasonList> reasonLists = new ArrayList<>();


      reasonList reasonList1 = new reasonList();
      reasonList1.setReasonQty("2");
      reasonList1.setCodeType("loss");
      reasonList1.setReasonCode("BIN4");
      reasonList1.setReasonDesc("AT21：Lead变形");
      List<String> sns = new ArrayList<>();
      sns.add("1");
      sns.add("2");
      reasonList1.setReasonSN(sns);
      reasonLists.add(reasonList1);
      outputList2.setReasonList(reasonLists);

      outputLists.add(outputList2);*/


      autoTrackOutDTO.setOutputList(outputLists);
//      String info = JSON.toJSONString(autoTrackOutDTO);
//      System.out.println(info);
      String trackOutStr = "{\n" +
              "    \"data\": [\n" +
              "        {\n" +
              "            \"Params\": [\n" +
              "                {\n" +
              "                    \"param\": \"Recipe\",\n" +
              "                    \"value\": null\n" +
              "                },\n" +
              "                {\n" +
              "                    \"param\": \"Tester\",\n" +
              "                    \"value\": \"TEST01\"\n" +
              "                },\n" +
              "                {\n" +
              "                    \"param\": \"BINNO\",\n" +
              "                    \"value\": \"1\"\n" +
              "                },\n" +
              "                {\n" +
              "                    \"param\": \"P\\/F\",\n" +
              "                    \"value\": \"P\"\n" +
              "                }\n" +
              "            ],\n" +
              "            \"parameter\": [\n" +
              "                \"PSAT_2.515G(DBM)\",\n" +
              "                \"PSAT_2.595G(DBM)\",\n" +
              "                \"PSAT_2.675G(DBM)\",\n" +
              "                \"EFF_2.515G(%)\",\n" +
              "                \"EFF_2.595G(%)\",\n" +
              "                \"EFF_2.675G(%)\",\n" +
              "                \"GAIN_2.515G(DB)\",\n" +
              "                \"GAIN_2.595G(DB)\",\n" +
              "                \"GAIN_2.675G(DB)\",\n" +
              "                \"Vbr_Peak_50V(V)\",\n" +
              "                \"Vgsq_Carrier(V)\",\n" +
              "                \"Vgsq_Peak(V)\"\n" +
              "            ],\n" +
              "            \"rawData\": [\n" +
              "                \"1.935\",\n" +
              "                \"1.197\",\n" +
              "                \"1.486\",\n" +
              "                \"1.184\",\n" +
              "                \"1.404\",\n" +
              "                \"1.93\",\n" +
              "                \"1.491\",\n" +
              "                \"1.365\",\n" +
              "                \"1.241\",\n" +
              "                \"1.081\",\n" +
              "                \"1.791\",\n" +
              "                \"1.945\"\n" +
              "            ],\n" +
              "            \"tubeNum\": \"11\"\n" +
              "        },\n" +
              "\t\t{\n" +
              "            \"Params\": [\n" +
              "                {\n" +
              "                    \"param\": \"Recipe\",\n" +
              "                    \"value\": null\n" +
              "                },\n" +
              "                {\n" +
              "                    \"param\": \"Tester\",\n" +
              "                    \"value\": \"TEST01\"\n" +
              "                },\n" +
              "                {\n" +
              "                    \"param\": \"BINNO\",\n" +
              "                    \"value\": \"1\"\n" +
              "                },\n" +
              "                {\n" +
              "                    \"param\": \"P\\/F\",\n" +
              "                    \"value\": \"P\"\n" +
              "                }\n" +
              "            ],\n" +
              "            \"parameter\": [\n" +
              "                \"PSAT_2.515G(DBM)\",\n" +
              "                \"PSAT_2.595G(DBM)\",\n" +
              "                \"PSAT_2.675G(DBM)\",\n" +
              "                \"EFF_2.515G(%)\",\n" +
              "                \"EFF_2.595G(%)\",\n" +
              "                \"EFF_2.675G(%)\",\n" +
              "                \"GAIN_2.515G(DB)\",\n" +
              "                \"GAIN_2.595G(DB)\",\n" +
              "                \"GAIN_2.675G(DB)\",\n" +
              "                \"Vbr_Peak_50V(V)\",\n" +
              "                \"Vgsq_Carrier(V)\",\n" +
              "                \"Vgsq_Peak(V)\"\n" +
              "            ],\n" +
              "            \"rawData\": [\n" +
              "                \"2.935\",\n" +
              "                \"2.197\",\n" +
              "                \"2.486\",\n" +
              "                \"2.184\",\n" +
              "                \"2.404\",\n" +
              "                \"2.93\",\n" +
              "                \"2.491\",\n" +
              "                \"2.365\",\n" +
              "                \"2.241\",\n" +
              "                \"2.081\",\n" +
              "                \"2.791\",\n" +
              "                \"2.945\"\n" +
              "            ],\n" +
              "            \"tubeNum\": \"10\"\n" +
              "        },{\n" +
              "            \"Params\": [\n" +
              "                {\n" +
              "                    \"param\": \"Recipe\",\n" +
              "                    \"value\": null\n" +
              "                },\n" +
              "                {\n" +
              "                    \"param\": \"Tester\",\n" +
              "                    \"value\": \"TEST01\"\n" +
              "                },\n" +
              "                {\n" +
              "                    \"param\": \"BINNO\",\n" +
              "                    \"value\": \"1\"\n" +
              "                },\n" +
              "                {\n" +
              "                    \"param\": \"P\\/F\",\n" +
              "                    \"value\": \"P\"\n" +
              "                }\n" +
              "            ],\n" +
              "            \"parameter\": [\n" +
              "                \"PSAT_2.515G(DBM)\",\n" +
              "                \"PSAT_2.595G(DBM)\",\n" +
              "                \"PSAT_2.675G(DBM)\",\n" +
              "                \"EFF_2.515G(%)\",\n" +
              "                \"EFF_2.595G(%)\",\n" +
              "                \"EFF_2.675G(%)\",\n" +
              "                \"GAIN_2.515G(DB)\",\n" +
              "                \"GAIN_2.595G(DB)\",\n" +
              "                \"GAIN_2.675G(DB)\",\n" +
              "                \"Vbr_Peak_50V(V)\",\n" +
              "                \"Vgsq_Carrier(V)\",\n" +
              "                \"Vgsq_Peak(V)\"\n" +
              "            ],\n" +
              "            \"rawData\": [\n" +
              "                \"3.935\",\n" +
              "                \"3.197\",\n" +
              "                \"3.486\",\n" +
              "                \"3.184\",\n" +
              "                \"3.404\",\n" +
              "                \"3.93\",\n" +
              "                \"3.491\",\n" +
              "                \"3.365\",\n" +
              "                \"3.241\",\n" +
              "                \"3.081\",\n" +
              "                \"3.791\",\n" +
              "                \"3.945\"\n" +
              "            ],\n" +
              "            \"tubeNum\": \"9\"\n" +
              "        },{\n" +
              "            \"Params\": [\n" +
              "                {\n" +
              "                    \"param\": \"Recipe\",\n" +
              "                    \"value\": null\n" +
              "                },\n" +
              "                {\n" +
              "                    \"param\": \"Tester\",\n" +
              "                    \"value\": \"TEST01\"\n" +
              "                },\n" +
              "                {\n" +
              "                    \"param\": \"BINNO\",\n" +
              "                    \"value\": \"1\"\n" +
              "                },\n" +
              "                {\n" +
              "                    \"param\": \"P\\/F\",\n" +
              "                    \"value\": \"P\"\n" +
              "                }\n" +
              "            ],\n" +
              "            \"parameter\": [\n" +
              "                \"PSAT_2.515G(DBM)\",\n" +
              "                \"PSAT_2.595G(DBM)\",\n" +
              "                \"PSAT_2.675G(DBM)\",\n" +
              "                \"EFF_2.515G(%)\",\n" +
              "                \"EFF_2.595G(%)\",\n" +
              "                \"EFF_2.675G(%)\",\n" +
              "                \"GAIN_2.515G(DB)\",\n" +
              "                \"GAIN_2.595G(DB)\",\n" +
              "                \"GAIN_2.675G(DB)\",\n" +
              "                \"Vbr_Peak_50V(V)\",\n" +
              "                \"Vgsq_Carrier(V)\",\n" +
              "                \"Vgsq_Peak(V)\"\n" +
              "            ],\n" +
              "            \"rawData\": [\n" +
              "                \"4.935\",\n" +
              "                \"4.197\",\n" +
              "                \"4.486\",\n" +
              "                \"4.184\",\n" +
              "                \"4.404\",\n" +
              "                \"4.93\",\n" +
              "                \"4.491\",\n" +
              "                \"4.365\",\n" +
              "                \"4.241\",\n" +
              "                \"4.081\",\n" +
              "                \"4.791\",\n" +
              "                \"4.945\"\n" +
              "            ],\n" +
              "            \"tubeNum\": \"8\"\n" +
              "        },{\n" +
              "            \"Params\": [\n" +
              "                {\n" +
              "                    \"param\": \"Recipe\",\n" +
              "                    \"value\": null\n" +
              "                },\n" +
              "                {\n" +
              "                    \"param\": \"Tester\",\n" +
              "                    \"value\": \"TEST01\"\n" +
              "                },\n" +
              "                {\n" +
              "                    \"param\": \"BINNO\",\n" +
              "                    \"value\": \"1\"\n" +
              "                },\n" +
              "                {\n" +
              "                    \"param\": \"P\\/F\",\n" +
              "                    \"value\": \"P\"\n" +
              "                }\n" +
              "            ],\n" +
              "            \"parameter\": [\n" +
              "                \"PSAT_2.515G(DBM)\",\n" +
              "                \"PSAT_2.595G(DBM)\",\n" +
              "                \"PSAT_2.675G(DBM)\",\n" +
              "                \"EFF_2.515G(%)\",\n" +
              "                \"EFF_2.595G(%)\",\n" +
              "                \"EFF_2.675G(%)\",\n" +
              "                \"GAIN_2.515G(DB)\",\n" +
              "                \"GAIN_2.595G(DB)\",\n" +
              "                \"GAIN_2.675G(DB)\",\n" +
              "                \"Vbr_Peak_50V(V)\",\n" +
              "                \"Vgsq_Carrier(V)\",\n" +
              "                \"Vgsq_Peak(V)\"\n" +
              "            ],\n" +
              "            \"rawData\": [\n" +
              "                \"5.935\",\n" +
              "                \"5.197\",\n" +
              "                \"5.486\",\n" +
              "                \"5.184\",\n" +
              "                \"5.404\",\n" +
              "                \"5.93\",\n" +
              "                \"5.491\",\n" +
              "                \"5.365\",\n" +
              "                \"5.241\",\n" +
              "                \"5.081\",\n" +
              "                \"5.791\",\n" +
              "                \"5.945\"\n" +
              "            ],\n" +
              "            \"tubeNum\": \"7\"\n" +
              "        },{\n" +
              "            \"Params\": [\n" +
              "                {\n" +
              "                    \"param\": \"Recipe\",\n" +
              "                    \"value\": null\n" +
              "                },\n" +
              "                {\n" +
              "                    \"param\": \"Tester\",\n" +
              "                    \"value\": \"TEST01\"\n" +
              "                },\n" +
              "                {\n" +
              "                    \"param\": \"BINNO\",\n" +
              "                    \"value\": \"1\"\n" +
              "                },\n" +
              "                {\n" +
              "                    \"param\": \"P\\/F\",\n" +
              "                    \"value\": \"P\"\n" +
              "                }\n" +
              "            ],\n" +
              "            \"parameter\": [\n" +
              "                \"PSAT_2.515G(DBM)\",\n" +
              "                \"PSAT_2.595G(DBM)\",\n" +
              "                \"PSAT_2.675G(DBM)\",\n" +
              "                \"EFF_2.515G(%)\",\n" +
              "                \"EFF_2.595G(%)\",\n" +
              "                \"EFF_2.675G(%)\",\n" +
              "                \"GAIN_2.515G(DB)\",\n" +
              "                \"GAIN_2.595G(DB)\",\n" +
              "                \"GAIN_2.675G(DB)\",\n" +
              "                \"Vbr_Peak_50V(V)\",\n" +
              "                \"Vgsq_Carrier(V)\",\n" +
              "                \"Vgsq_Peak(V)\"\n" +
              "            ],\n" +
              "            \"rawData\": [\n" +
              "                \"6.935\",\n" +
              "                \"6.197\",\n" +
              "                \"6.486\",\n" +
              "                \"6.184\",\n" +
              "                \"6.404\",\n" +
              "                \"6.93\",\n" +
              "                \"6.491\",\n" +
              "                \"6.365\",\n" +
              "                \"6.241\",\n" +
              "                \"6.081\",\n" +
              "                \"6.791\",\n" +
              "                \"6.945\"\n" +
              "            ],\n" +
              "            \"tubeNum\": \"6\"\n" +
              "        },{\n" +
              "            \"Params\": [\n" +
              "                {\n" +
              "                    \"param\": \"Recipe\",\n" +
              "                    \"value\": null\n" +
              "                },\n" +
              "                {\n" +
              "                    \"param\": \"Tester\",\n" +
              "                    \"value\": \"TEST01\"\n" +
              "                },\n" +
              "                {\n" +
              "                    \"param\": \"BINNO\",\n" +
              "                    \"value\": \"1\"\n" +
              "                },\n" +
              "                {\n" +
              "                    \"param\": \"P\\/F\",\n" +
              "                    \"value\": \"P\"\n" +
              "                }\n" +
              "            ],\n" +
              "            \"parameter\": [\n" +
              "                \"PSAT_2.515G(DBM)\",\n" +
              "                \"PSAT_2.595G(DBM)\",\n" +
              "                \"PSAT_2.675G(DBM)\",\n" +
              "                \"EFF_2.515G(%)\",\n" +
              "                \"EFF_2.595G(%)\",\n" +
              "                \"EFF_2.675G(%)\",\n" +
              "                \"GAIN_2.515G(DB)\",\n" +
              "                \"GAIN_2.595G(DB)\",\n" +
              "                \"GAIN_2.675G(DB)\",\n" +
              "                \"Vbr_Peak_50V(V)\",\n" +
              "                \"Vgsq_Carrier(V)\",\n" +
              "                \"Vgsq_Peak(V)\"\n" +
              "            ],\n" +
              "            \"rawData\": [\n" +
              "                \"7.935\",\n" +
              "                \"7.197\",\n" +
              "                \"7.486\",\n" +
              "                \"7.184\",\n" +
              "                \"7.404\",\n" +
              "                \"7.93\",\n" +
              "                \"7.491\",\n" +
              "                \"7.365\",\n" +
              "                \"7.241\",\n" +
              "                \"7.081\",\n" +
              "                \"7.791\",\n" +
              "                \"7.945\"\n" +
              "            ],\n" +
              "            \"tubeNum\": \"5\"\n" +
              "        },{\n" +
              "            \"Params\": [\n" +
              "                {\n" +
              "                    \"param\": \"Recipe\",\n" +
              "                    \"value\": null\n" +
              "                },\n" +
              "                {\n" +
              "                    \"param\": \"Tester\",\n" +
              "                    \"value\": \"TEST01\"\n" +
              "                },\n" +
              "                {\n" +
              "                    \"param\": \"BINNO\",\n" +
              "                    \"value\": \"1\"\n" +
              "                },\n" +
              "                {\n" +
              "                    \"param\": \"P\\/F\",\n" +
              "                    \"value\": \"P\"\n" +
              "                }\n" +
              "            ],\n" +
              "            \"parameter\": [\n" +
              "                \"PSAT_2.515G(DBM)\",\n" +
              "                \"PSAT_2.595G(DBM)\",\n" +
              "                \"PSAT_2.675G(DBM)\",\n" +
              "                \"EFF_2.515G(%)\",\n" +
              "                \"EFF_2.595G(%)\",\n" +
              "                \"EFF_2.675G(%)\",\n" +
              "                \"GAIN_2.515G(DB)\",\n" +
              "                \"GAIN_2.595G(DB)\",\n" +
              "                \"GAIN_2.675G(DB)\",\n" +
              "                \"Vbr_Peak_50V(V)\",\n" +
              "                \"Vgsq_Carrier(V)\",\n" +
              "                \"Vgsq_Peak(V)\"\n" +
              "            ],\n" +
              "            \"rawData\": [\n" +
              "                \"10.935\",\n" +
              "                \"10.197\",\n" +
              "                \"10.486\",\n" +
              "                \"10.184\",\n" +
              "                \"10.404\",\n" +
              "                \"10.93\",\n" +
              "                \"10.491\",\n" +
              "                \"10.365\",\n" +
              "                \"10.241\",\n" +
              "                \"10.081\",\n" +
              "                \"10.791\",\n" +
              "                \"10.945\"\n" +
              "            ],\n" +
              "            \"tubeNum\": \"4\"\n" +
              "        },{\n" +
              "            \"Params\": [\n" +
              "                {\n" +
              "                    \"param\": \"Recipe\",\n" +
              "                    \"value\": null\n" +
              "                },\n" +
              "                {\n" +
              "                    \"param\": \"Tester\",\n" +
              "                    \"value\": \"TEST01\"\n" +
              "                },\n" +
              "                {\n" +
              "                    \"param\": \"BINNO\",\n" +
              "                    \"value\": \"1\"\n" +
              "                },\n" +
              "                {\n" +
              "                    \"param\": \"P\\/F\",\n" +
              "                    \"value\": \"P\"\n" +
              "                }\n" +
              "            ],\n" +
              "            \"parameter\": [\n" +
              "                \"PSAT_2.515G(DBM)\",\n" +
              "                \"PSAT_2.595G(DBM)\",\n" +
              "                \"PSAT_2.675G(DBM)\",\n" +
              "                \"EFF_2.515G(%)\",\n" +
              "                \"EFF_2.595G(%)\",\n" +
              "                \"EFF_2.675G(%)\",\n" +
              "                \"GAIN_2.515G(DB)\",\n" +
              "                \"GAIN_2.595G(DB)\",\n" +
              "                \"GAIN_2.675G(DB)\",\n" +
              "                \"Vbr_Peak_50V(V)\",\n" +
              "                \"Vgsq_Carrier(V)\",\n" +
              "                \"Vgsq_Peak(V)\"\n" +
              "            ],\n" +
              "            \"rawData\": [\n" +
              "                \"0.935\",\n" +
              "                \"0.197\",\n" +
              "                \"0.486\",\n" +
              "                \"0.184\",\n" +
              "                \"0.404\",\n" +
              "                \"0.93\",\n" +
              "                \"0.491\",\n" +
              "                \"0.365\",\n" +
              "                \"0.241\",\n" +
              "                \"0.081\",\n" +
              "                \"0.791\",\n" +
              "                \"0.945\"\n" +
              "            ],\n" +
              "            \"tubeNum\": \"3\"\n" +
              "        },{\n" +
              "            \"Params\": [\n" +
              "                {\n" +
              "                    \"param\": \"Recipe\",\n" +
              "                    \"value\": null\n" +
              "                },\n" +
              "                {\n" +
              "                    \"param\": \"Tester\",\n" +
              "                    \"value\": \"TEST01\"\n" +
              "                },\n" +
              "                {\n" +
              "                    \"param\": \"BINNO\",\n" +
              "                    \"value\": \"1\"\n" +
              "                },\n" +
              "                {\n" +
              "                    \"param\": \"P\\/F\",\n" +
              "                    \"value\": \"P\"\n" +
              "                }\n" +
              "            ],\n" +
              "            \"parameter\": [\n" +
              "                \"PSAT_2.515G(DBM)\",\n" +
              "                \"PSAT_2.595G(DBM)\",\n" +
              "                \"PSAT_2.675G(DBM)\",\n" +
              "                \"EFF_2.515G(%)\",\n" +
              "                \"EFF_2.595G(%)\",\n" +
              "                \"EFF_2.675G(%)\",\n" +
              "                \"GAIN_2.515G(DB)\",\n" +
              "                \"GAIN_2.595G(DB)\",\n" +
              "                \"GAIN_2.675G(DB)\",\n" +
              "                \"Vbr_Peak_50V(V)\",\n" +
              "                \"Vgsq_Carrier(V)\",\n" +
              "                \"Vgsq_Peak(V)\"\n" +
              "            ],\n" +
              "            \"rawData\": [\n" +
              "                \"11.935\",\n" +
              "                \"11.197\",\n" +
              "                \"11.486\",\n" +
              "                \"11.184\",\n" +
              "                \"11.404\",\n" +
              "                \"11.93\",\n" +
              "                \"11.491\",\n" +
              "                \"11.365\",\n" +
              "                \"11.241\",\n" +
              "                \"11.081\",\n" +
              "                \"11.791\",\n" +
              "                \"11.945\"\n" +
              "            ],\n" +
              "            \"tubeNum\": \"2\"\n" +
              "        },{\n" +
              "            \"Params\": [\n" +
              "                {\n" +
              "                    \"param\": \"Recipe\",\n" +
              "                    \"value\": null\n" +
              "                },\n" +
              "                {\n" +
              "                    \"param\": \"Tester\",\n" +
              "                    \"value\": \"TEST01\"\n" +
              "                },\n" +
              "                {\n" +
              "                    \"param\": \"BINNO\",\n" +
              "                    \"value\": \"1\"\n" +
              "                },\n" +
              "                {\n" +
              "                    \"param\": \"P\\/F\",\n" +
              "                    \"value\": \"P\"\n" +
              "                }\n" +
              "            ],\n" +
              "            \"parameter\": [\n" +
              "                \"PSAT_2.515G(DBM)\",\n" +
              "                \"PSAT_2.595G(DBM)\",\n" +
              "                \"PSAT_2.675G(DBM)\",\n" +
              "                \"EFF_2.515G(%)\",\n" +
              "                \"EFF_2.595G(%)\",\n" +
              "                \"EFF_2.675G(%)\",\n" +
              "                \"GAIN_2.515G(DB)\",\n" +
              "                \"GAIN_2.595G(DB)\",\n" +
              "                \"GAIN_2.675G(DB)\",\n" +
              "                \"Vbr_Peak_50V(V)\",\n" +
              "                \"Vgsq_Carrier(V)\",\n" +
              "                \"Vgsq_Peak(V)\"\n" +
              "            ],\n" +
              "            \"rawData\": [\n" +
              "                \"12.935\",\n" +
              "                \"12.197\",\n" +
              "                \"12.486\",\n" +
              "                \"12.184\",\n" +
              "                \"12.404\",\n" +
              "                \"12.93\",\n" +
              "                \"12.491\",\n" +
              "                \"12.365\",\n" +
              "                \"12.241\",\n" +
              "                \"12.081\",\n" +
              "                \"12.791\",\n" +
              "                \"12.945\"\n" +
              "            ],\n" +
              "            \"tubeNum\": \"1\"\n" +
              "        }\n" +
              "    ],\n" +
              "    \"eqpId\": \"PTDT04\",\n" +
              "    \"lotId\": \"D2224003\",\n" +
              "    \"materialBoxBarcode\": [],\n" +
              "    \"materialInfo\": [],\n" +
              "    \"operId\": \"nxadmin\",\n" +
              "    \"outputList\": [\n" +
              "        {\n" +
              "            \"inputQty\": [],\n" +
              "            \"output\": \"304\",\n" +
              "            \"reasonList\": [],\n" +
              "            \"type\": \"Normal\"\n" +
              "        }\n" +
              "    ],\n" +
              "    \"remark\": null,\n" +
              "    \"testerId\": \"TEST01\"\n" +
              "}";

//      System.out.println(trackOutStr);
      String summer = autoTrackOutService.autoTrackOutService(trackOutStr);
      System.out.println(summer);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}
