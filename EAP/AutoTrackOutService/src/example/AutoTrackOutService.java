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
              "    \"data\": [{\n" +
              "            \"Params\": [{\n" +
              "                    \"param\": \"Recipe\",\n" +
              "                    \"value\": null\n" +
              "                }, {\n" +
              "                    \"param\": \"Tester\",\n" +
              "                    \"value\": \"TEST01\"\n" +
              "                }, {\n" +
              "                    \"param\": \"BINNO\",\n" +
              "                    \"value\": \"1\"\n" +
              "                }, {\n" +
              "                    \"param\": \"P\\/F\",\n" +
              "                    \"value\": \"P\"\n" +
              "                }\n" +
              "            ],\n" +
              "            \"parameter\": [\"Eff_3.4G(%)\", \"Eff_3.5G(%)\", \"Eff_3.6G(%)\", \"Gain_3.4G(dB)\", \"Gain_3.5G(dB)\", \"Gain_3.6G(dB)\", \"Id_Carrier(mA)\", \"Id_Peak(mA)\", \"Idleak_Carrier_150V(uA)\", \"Idleak_Carrier_50V(uA)\", \"Idleak_Peak_150V(uA)\", \"Idleak_Peak_50V(uA)\", \"Idsq_Carrier(mA)\", \"Idsq_Peak(mA)\", \"Idth_Carrier(mA)\", \"Idth_Peak(mA)\", \"Ig_Carrier(uA)\", \"Ig_Peak(uA)\", \"Igleak_Carrier_150V(uA)\", \"Igleak_Carrier_50V(uA)\", \"Igleak_Peak_150V(uA)\", \"Igleak_Peak_50V(uA)\", \"Psat_3.4G(dBm)\", \"Psat_3.5G(dBm)\", \"Psat_3.6G(dBm)\", \"RL_3.4G(dB)\", \"RL_3.5G(dB)\", \"RL_3.6G(dB)\", \"Vbr_Carrier_150V(V)\", \"Vbr_Carrier_50V(V)\", \"Vbr_Peak_150V(V)\", \"Vbr_Peak_50V(V)\", \"Vgsq_Carrier(V)\", \"Vgsq_Peak(V)\", \"Vgsq_Peak_offseted(V)\", \"Vth_Carrier(V)\", \"Vth_Peak(V)\"],\n" +
              "            \"rawData\": [\"44.935\", \"46.197\", \"43.486\", \"15.184\", \"15.404\", \"14.93\", \"129.491\", \"193.365\", \"153.241\", \"101.081\", \"107.791\", \"70.945\", \"187.647\", \"209.908\", \"10.394\", \"17.28\", \"-91.533\", \"-52.207\", \"-123.915\", \"-87.277\", \"-73.659\", \"-57.936\", \"53.501\", \"53.456\", \"52.948\", \"-13.731\", \"-12.305\", \"-10.249\", \"150\", \"50\", \"150\", \"50\", \"-2.76\", \"-2.88\", \"-5.68\", \"-2.98\", \"-3.06\"],\n" +
              "            \"tubeNum\": \"10\"\n" +
              "        }, {\n" +
              "            \"Params\": [{\n" +
              "                    \"param\": \"Recipe\",\n" +
              "                    \"value\": null\n" +
              "                }, {\n" +
              "                    \"param\": \"Tester\",\n" +
              "                    \"value\": \"TEST01\"\n" +
              "                }, {\n" +
              "                    \"param\": \"BINNO\",\n" +
              "                    \"value\": \"1\"\n" +
              "                }, {\n" +
              "                    \"param\": \"P\\/F\",\n" +
              "                    \"value\": \"P\"\n" +
              "                }\n" +
              "            ],\n" +
              "            \"parameter\": [\"Vbr_Peak_50V(V)\", \"Vgsq_Carrier(V)\", \"Vgsq_Peak(V)\", \"Vgsq_Peak_offseted(V)\", \"Vth_Carrier(V)\", \"Vth_Peak(V)\", \"Eff_3.4G(%)\", \"Eff_3.5G(%)\", \"Eff_3.6G(%)\", \"Gain_3.4G(dB)\", \"Gain_3.5G(dB)\", \"Gain_3.6G(dB)\", \"Id_Carrier(mA)\", \"Id_Peak(mA)\", \"Idleak_Carrier_150V(uA)\", \"Idleak_Carrier_50V(uA)\", \"Idleak_Peak_150V(uA)\", \"Idleak_Peak_50V(uA)\", \"Idsq_Carrier(mA)\", \"Idsq_Peak(mA)\", \"Idth_Carrier(mA)\", \"Idth_Peak(mA)\", \"Ig_Carrier(uA)\", \"Ig_Peak(uA)\", \"Igleak_Carrier_150V(uA)\", \"Igleak_Carrier_50V(uA)\", \"Igleak_Peak_150V(uA)\", \"Igleak_Peak_50V(uA)\", \"Psat_3.4G(dBm)\", \"Psat_3.5G(dBm)\", \"Psat_3.6G(dBm)\", \"RL_3.4G(dB)\", \"RL_3.5G(dB)\", \"RL_3.6G(dB)\", \"Vbr_Carrier_150V(V)\", \"Vbr_Carrier_50V(V)\", \"Vbr_Peak_150V(V)\"],\n" +
              "            \"rawData\": [\"50\", \"-2.67\", \"-2.63\", \"-5.43\", \"-2.94\", \"-2.8\", \"43.379\", \"45.424\", \"43.847\", \"15.297\", \"15.476\", \"14.939\", \"129.598\", \"202.743\", \"108.309\", \"71.212\", \"185.441\", \"118.097\", \"191.282\", \"220.534\", \"10.186\", \"17.281\", \"-47.328\", \"-123.102\", \"-68.521\", \"-43.888\", \"-173.712\", \"-127.574\", \"53.839\", \"53.744\", \"53.155\", \"-14.722\", \"-14.08\", \"-12.665\", \"150\", \"50\", \"150\"],\n" +
              "            \"tubeNum\": \"9\"\n" +
              "        }, {\n" +
              "            \"Params\": [{\n" +
              "                    \"param\": \"Recipe\",\n" +
              "                    \"value\": null\n" +
              "                }, {\n" +
              "                    \"param\": \"Tester\",\n" +
              "                    \"value\": \"TEST01\"\n" +
              "                }, {\n" +
              "                    \"param\": \"BINNO\",\n" +
              "                    \"value\": \"1\"\n" +
              "                }, {\n" +
              "                    \"param\": \"P\\/F\",\n" +
              "                    \"value\": \"P\"\n" +
              "                }\n" +
              "            ],\n" +
              "            \"parameter\": [\"Eff_3.4G(%)\", \"Eff_3.5G(%)\", \"Eff_3.6G(%)\", \"Gain_3.4G(dB)\", \"Gain_3.5G(dB)\", \"Gain_3.6G(dB)\", \"Id_Carrier(mA)\", \"Id_Peak(mA)\", \"Idleak_Carrier_150V(uA)\", \"Idleak_Carrier_50V(uA)\", \"Idleak_Peak_150V(uA)\", \"Idleak_Peak_50V(uA)\", \"Idsq_Carrier(mA)\", \"Idsq_Peak(mA)\", \"Idth_Carrier(mA)\", \"Idth_Peak(mA)\", \"Ig_Carrier(uA)\", \"Ig_Peak(uA)\", \"Igleak_Carrier_150V(uA)\", \"Igleak_Carrier_50V(uA)\", \"Igleak_Peak_150V(uA)\", \"Igleak_Peak_50V(uA)\", \"Psat_3.4G(dBm)\", \"Psat_3.5G(dBm)\", \"Psat_3.6G(dBm)\", \"RL_3.4G(dB)\", \"RL_3.5G(dB)\", \"RL_3.6G(dB)\", \"Vbr_Carrier_150V(V)\", \"Vbr_Carrier_50V(V)\", \"Vbr_Peak_150V(V)\", \"Vbr_Peak_50V(V)\", \"Vgsq_Carrier(V)\", \"Vgsq_Peak(V)\", \"Vgsq_Peak_offseted(V)\", \"Vth_Carrier(V)\", \"Vth_Peak(V)\"],\n" +
              "            \"rawData\": [\"44.493\", \"46.331\", \"44.782\", \"15.283\", \"15.558\", \"15.186\", \"129.432\", \"196.74\", \"126.473\", \"82.137\", \"143.468\", \"98.338\", \"187.432\", \"218.884\", \"10.183\", \"16.793\", \"-61.059\", \"-81\", \"-91.458\", \"-65.216\", \"-125.428\", \"-88.462\", \"53.596\", \"53.548\", \"52.985\", \"-13.461\", \"-12.014\", \"-9.835\", \"150\", \"50\", \"150\", \"50\", \"-2.85\", \"-2.84\", \"-5.64\", \"-3.08\", \"-3.02\"],\n" +
              "            \"tubeNum\": \"8\"\n" +
              "        }, {\n" +
              "            \"Params\": [{\n" +
              "                    \"param\": \"Recipe\",\n" +
              "                    \"value\": null\n" +
              "                }, {\n" +
              "                    \"param\": \"Tester\",\n" +
              "                    \"value\": \"TEST01\"\n" +
              "                }, {\n" +
              "                    \"param\": \"BINNO\",\n" +
              "                    \"value\": \"1\"\n" +
              "                }, {\n" +
              "                    \"param\": \"P\\/F\",\n" +
              "                    \"value\": \"P\"\n" +
              "                }\n" +
              "            ],\n" +
              "            \"parameter\": [\"Eff_3.4G(%)\", \"Eff_3.5G(%)\", \"Eff_3.6G(%)\", \"Gain_3.4G(dB)\", \"Gain_3.5G(dB)\", \"Gain_3.6G(dB)\", \"Id_Carrier(mA)\", \"Id_Peak(mA)\", \"Idleak_Carrier_150V(uA)\", \"Idleak_Carrier_50V(uA)\", \"Idleak_Peak_150V(uA)\", \"Idleak_Peak_50V(uA)\", \"Idsq_Carrier(mA)\", \"Idsq_Peak(mA)\", \"Idth_Carrier(mA)\", \"Idth_Peak(mA)\", \"Ig_Carrier(uA)\", \"Ig_Peak(uA)\", \"Igleak_Carrier_150V(uA)\", \"Igleak_Carrier_50V(uA)\", \"Igleak_Peak_150V(uA)\", \"Igleak_Peak_50V(uA)\", \"Psat_3.4G(dBm)\", \"Psat_3.5G(dBm)\", \"Psat_3.6G(dBm)\", \"RL_3.4G(dB)\", \"RL_3.5G(dB)\", \"RL_3.6G(dB)\", \"Vbr_Carrier_150V(V)\", \"Vbr_Carrier_50V(V)\", \"Vbr_Peak_150V(V)\", \"Vbr_Peak_50V(V)\", \"Vgsq_Carrier(V)\", \"Vgsq_Peak(V)\", \"Vgsq_Peak_offseted(V)\", \"Vth_Carrier(V)\", \"Vth_Peak(V)\"],\n" +
              "            \"rawData\": [\"44.242\", \"46.293\", \"45.036\", \"15.418\", \"15.634\", \"15.188\", \"129.394\", \"192.631\", \"105.211\", \"61.159\", \"226.765\", \"156.624\", \"187.858\", \"212.916\", \"9.4\", \"16.966\", \"-39.409\", \"-153.378\", \"-63.493\", \"-43.38\", \"-228.994\", \"-164.122\", \"53.905\", \"53.795\", \"53.224\", \"-14.599\", \"-13.601\", \"-11.984\", \"150\", \"50\", \"150\", \"50\", \"-2.57\", \"-2.65\", \"-5.45\", \"-2.84\", \"-2.82\"],\n" +
              "            \"tubeNum\": \"7\"\n" +
              "        }, {\n" +
              "            \"Params\": [{\n" +
              "                    \"param\": \"Recipe\",\n" +
              "                    \"value\": null\n" +
              "                }, {\n" +
              "                    \"param\": \"Tester\",\n" +
              "                    \"value\": \"TEST01\"\n" +
              "                }, {\n" +
              "                    \"param\": \"BINNO\",\n" +
              "                    \"value\": \"1\"\n" +
              "                }, {\n" +
              "                    \"param\": \"P\\/F\",\n" +
              "                    \"value\": \"P\"\n" +
              "                }\n" +
              "            ],\n" +
              "            \"parameter\": [\"Eff_3.4G(%)\", \"Eff_3.5G(%)\", \"Eff_3.6G(%)\", \"Gain_3.4G(dB)\", \"Gain_3.5G(dB)\", \"Gain_3.6G(dB)\", \"Id_Carrier(mA)\", \"Id_Peak(mA)\", \"Idleak_Carrier_150V(uA)\", \"Idleak_Carrier_50V(uA)\", \"Idleak_Peak_150V(uA)\", \"Idleak_Peak_50V(uA)\", \"Idsq_Carrier(mA)\", \"Idsq_Peak(mA)\", \"Idth_Carrier(mA)\", \"Idth_Peak(mA)\", \"Ig_Carrier(uA)\", \"Ig_Peak(uA)\", \"Igleak_Carrier_150V(uA)\", \"Igleak_Carrier_50V(uA)\", \"Igleak_Peak_150V(uA)\", \"Igleak_Peak_50V(uA)\", \"Psat_3.4G(dBm)\", \"Psat_3.5G(dBm)\", \"Psat_3.6G(dBm)\", \"RL_3.4G(dB)\", \"RL_3.5G(dB)\", \"RL_3.6G(dB)\", \"Vbr_Carrier_150V(V)\", \"Vbr_Carrier_50V(V)\", \"Vbr_Peak_150V(V)\", \"Vbr_Peak_50V(V)\", \"Vgsq_Carrier(V)\", \"Vgsq_Peak(V)\", \"Vgsq_Peak_offseted(V)\", \"Vth_Carrier(V)\", \"Vth_Peak(V)\"],\n" +
              "            \"rawData\": [\"44.106\", \"45.663\", \"43.923\", \"15.428\", \"15.599\", \"15.09\", \"129.426\", \"185.242\", \"130.918\", \"80.482\", \"215.342\", \"145.975\", \"188.192\", \"209.947\", \"8.787\", \"17.391\", \"-65.582\", \"-153.704\", \"-90.074\", \"-61.713\", \"-221.411\", \"-164.373\", \"53.817\", \"53.725\", \"53.192\", \"-14.232\", \"-13.216\", \"-11.371\", \"150\", \"50\", \"150\", \"50\", \"-2.63\", \"-2.59\", \"-5.39\", \"-2.88\", \"-2.76\"],\n" +
              "            \"tubeNum\": \"6\"\n" +
              "        }, {\n" +
              "            \"Params\": [{\n" +
              "                    \"param\": \"Recipe\",\n" +
              "                    \"value\": null\n" +
              "                }, {\n" +
              "                    \"param\": \"Tester\",\n" +
              "                    \"value\": \"TEST01\"\n" +
              "                }, {\n" +
              "                    \"param\": \"BINNO\",\n" +
              "                    \"value\": \"1\"\n" +
              "                }, {\n" +
              "                    \"param\": \"P\\/F\",\n" +
              "                    \"value\": \"P\"\n" +
              "                }\n" +
              "            ],\n" +
              "            \"parameter\": [\"Eff_3.4G(%)\", \"Eff_3.5G(%)\", \"Eff_3.6G(%)\", \"Gain_3.4G(dB)\", \"Gain_3.5G(dB)\", \"Gain_3.6G(dB)\", \"Id_Carrier(mA)\", \"Id_Peak(mA)\", \"Idleak_Carrier_150V(uA)\", \"Idleak_Carrier_50V(uA)\", \"Idleak_Peak_150V(uA)\", \"Idleak_Peak_50V(uA)\", \"Idsq_Carrier(mA)\", \"Idsq_Peak(mA)\", \"Idth_Carrier(mA)\", \"Idth_Peak(mA)\", \"Ig_Carrier(uA)\", \"Ig_Peak(uA)\", \"Igleak_Carrier_150V(uA)\", \"Igleak_Carrier_50V(uA)\", \"Igleak_Peak_150V(uA)\", \"Igleak_Peak_50V(uA)\", \"Psat_3.4G(dBm)\", \"Psat_3.5G(dBm)\", \"Psat_3.6G(dBm)\", \"RL_3.4G(dB)\", \"RL_3.5G(dB)\", \"RL_3.6G(dB)\", \"Vbr_Carrier_150V(V)\", \"Vbr_Carrier_50V(V)\", \"Vbr_Peak_150V(V)\", \"Vbr_Peak_50V(V)\", \"Vgsq_Carrier(V)\", \"Vgsq_Peak(V)\", \"Vgsq_Peak_offseted(V)\", \"Vth_Carrier(V)\", \"Vth_Peak(V)\"],\n" +
              "            \"rawData\": [\"43.318\", \"45.509\", \"44.414\", \"15.225\", \"15.403\", \"14.88\", \"129.422\", \"190.345\", \"125.598\", \"71.13\", \"247.075\", \"157.192\", \"184.998\", \"204.575\", \"10.271\", \"17.402\", \"-51.287\", \"-155.078\", \"-74.566\", \"-53.803\", \"-224.951\", \"-170.06\", \"53.862\", \"53.717\", \"53.124\", \"-14.852\", \"-14.019\", \"-12.461\", \"150\", \"50\", \"150\", \"50\", \"-2.65\", \"-2.66\", \"-5.46\", \"-2.92\", \"-2.82\"],\n" +
              "            \"tubeNum\": \"5\"\n" +
              "        }, {\n" +
              "            \"Params\": [{\n" +
              "                    \"param\": \"Recipe\",\n" +
              "                    \"value\": null\n" +
              "                }, {\n" +
              "                    \"param\": \"Tester\",\n" +
              "                    \"value\": \"TEST01\"\n" +
              "                }, {\n" +
              "                    \"param\": \"BINNO\",\n" +
              "                    \"value\": \"1\"\n" +
              "                }, {\n" +
              "                    \"param\": \"P\\/F\",\n" +
              "                    \"value\": \"P\"\n" +
              "                }\n" +
              "            ],\n" +
              "            \"parameter\": [\"Eff_3.4G(%)\", \"Eff_3.5G(%)\", \"Eff_3.6G(%)\", \"Gain_3.4G(dB)\", \"Gain_3.5G(dB)\", \"Gain_3.6G(dB)\", \"Id_Carrier(mA)\", \"Id_Peak(mA)\", \"Idleak_Carrier_150V(uA)\", \"Idleak_Carrier_50V(uA)\", \"Idleak_Peak_150V(uA)\", \"Idleak_Peak_50V(uA)\", \"Idsq_Carrier(mA)\", \"Idsq_Peak(mA)\", \"Idth_Carrier(mA)\", \"Idth_Peak(mA)\", \"Ig_Carrier(uA)\", \"Ig_Peak(uA)\", \"Igleak_Carrier_150V(uA)\", \"Igleak_Carrier_50V(uA)\", \"Igleak_Peak_150V(uA)\", \"Igleak_Peak_50V(uA)\", \"Psat_3.4G(dBm)\", \"Psat_3.5G(dBm)\", \"Psat_3.6G(dBm)\", \"RL_3.4G(dB)\", \"RL_3.5G(dB)\", \"RL_3.6G(dB)\", \"Vbr_Carrier_150V(V)\", \"Vbr_Carrier_50V(V)\", \"Vbr_Peak_150V(V)\", \"Vbr_Peak_50V(V)\", \"Vgsq_Carrier(V)\", \"Vgsq_Peak(V)\", \"Vgsq_Peak_offseted(V)\", \"Vth_Carrier(V)\", \"Vth_Peak(V)\"],\n" +
              "            \"rawData\": [\"43.617\", \"46.097\", \"44.741\", \"15.326\", \"15.615\", \"15.22\", \"129.356\", \"184.443\", \"166.659\", \"99.516\", \"194.926\", \"119.105\", \"183.757\", \"202.618\", \"9.712\", \"17.357\", \"-85.497\", \"-115.271\", \"-123.068\", \"-85.865\", \"-172.095\", \"-128.467\", \"53.748\", \"53.657\", \"53.083\", \"-15.183\", \"-14.263\", \"-13.142\", \"150\", \"50\", \"150\", \"50\", \"-2.85\", \"-2.66\", \"-5.46\", \"-3.08\", \"-2.82\"],\n" +
              "            \"tubeNum\": \"4\"\n" +
              "        }, {\n" +
              "            \"Params\": [{\n" +
              "                    \"param\": \"Recipe\",\n" +
              "                    \"value\": null\n" +
              "                }, {\n" +
              "                    \"param\": \"Tester\",\n" +
              "                    \"value\": \"TEST01\"\n" +
              "                }, {\n" +
              "                    \"param\": \"BINNO\",\n" +
              "                    \"value\": \"1\"\n" +
              "                }, {\n" +
              "                    \"param\": \"P\\/F\",\n" +
              "                    \"value\": \"P\"\n" +
              "                }\n" +
              "            ],\n" +
              "            \"parameter\": [\"Eff_3.4G(%)\", \"Eff_3.5G(%)\", \"Eff_3.6G(%)\", \"Gain_3.4G(dB)\", \"Gain_3.5G(dB)\", \"Gain_3.6G(dB)\", \"Id_Carrier(mA)\", \"Id_Peak(mA)\", \"Idleak_Carrier_150V(uA)\", \"Idleak_Carrier_50V(uA)\", \"Idleak_Peak_150V(uA)\", \"Idleak_Peak_50V(uA)\", \"Idsq_Carrier(mA)\", \"Idsq_Peak(mA)\", \"Idth_Carrier(mA)\", \"Idth_Peak(mA)\", \"Ig_Carrier(uA)\", \"Ig_Peak(uA)\", \"Igleak_Carrier_150V(uA)\", \"Igleak_Carrier_50V(uA)\", \"Igleak_Peak_150V(uA)\", \"Igleak_Peak_50V(uA)\", \"Psat_3.4G(dBm)\", \"Psat_3.5G(dBm)\", \"Psat_3.6G(dBm)\", \"RL_3.4G(dB)\", \"RL_3.5G(dB)\", \"RL_3.6G(dB)\", \"Vbr_Carrier_150V(V)\", \"Vbr_Carrier_50V(V)\", \"Vbr_Peak_150V(V)\", \"Vbr_Peak_50V(V)\", \"Vgsq_Carrier(V)\", \"Vgsq_Peak(V)\", \"Vgsq_Peak_offseted(V)\", \"Vth_Carrier(V)\", \"Vth_Peak(V)\"],\n" +
              "            \"rawData\": [\"43.667\", \"45.914\", \"44.643\", \"15.285\", \"15.586\", \"15.168\", \"129.47\", \"200.783\", \"162.236\", \"103.286\", \"207.098\", \"125.301\", \"181.641\", \"220.967\", \"10.429\", \"14.78\", \"-82.948\", \"-124.64\", \"-117.7\", \"-79.255\", \"-187.344\", \"-135.018\", \"53.699\", \"53.612\", \"53.054\", \"-15.219\", \"-14.257\", \"-12.709\", \"150\", \"50\", \"150\", \"50\", \"-2.86\", \"-2.64\", \"-5.44\", \"-3.08\", \"-2.82\"],\n" +
              "            \"tubeNum\": \"3\"\n" +
              "        }, {\n" +
              "            \"Params\": [{\n" +
              "                    \"param\": \"Recipe\",\n" +
              "                    \"value\": null\n" +
              "                }, {\n" +
              "                    \"param\": \"Tester\",\n" +
              "                    \"value\": \"TEST01\"\n" +
              "                }, {\n" +
              "                    \"param\": \"BINNO\",\n" +
              "                    \"value\": \"1\"\n" +
              "                }, {\n" +
              "                    \"param\": \"P\\/F\",\n" +
              "                    \"value\": \"P\"\n" +
              "                }\n" +
              "            ],\n" +
              "            \"parameter\": [\"Eff_3.4G(%)\", \"Eff_3.5G(%)\", \"Eff_3.6G(%)\", \"Gain_3.4G(dB)\", \"Gain_3.5G(dB)\", \"Gain_3.6G(dB)\", \"Id_Carrier(mA)\", \"Id_Peak(mA)\", \"Idleak_Carrier_150V(uA)\", \"Idleak_Carrier_50V(uA)\", \"Idleak_Peak_150V(uA)\", \"Idleak_Peak_50V(uA)\", \"Idsq_Carrier(mA)\", \"Idsq_Peak(mA)\", \"Idth_Carrier(mA)\", \"Idth_Peak(mA)\", \"Ig_Carrier(uA)\", \"Ig_Peak(uA)\", \"Igleak_Carrier_150V(uA)\", \"Igleak_Carrier_50V(uA)\", \"Igleak_Peak_150V(uA)\", \"Igleak_Peak_50V(uA)\", \"Psat_3.4G(dBm)\", \"Psat_3.5G(dBm)\", \"Psat_3.6G(dBm)\", \"RL_3.4G(dB)\", \"RL_3.5G(dB)\", \"RL_3.6G(dB)\", \"Vbr_Carrier_150V(V)\", \"Vbr_Carrier_50V(V)\", \"Vbr_Peak_150V(V)\", \"Vbr_Peak_50V(V)\", \"Vgsq_Carrier(V)\", \"Vgsq_Peak(V)\", \"Vgsq_Peak_offseted(V)\", \"Vth_Carrier(V)\", \"Vth_Peak(V)\"],\n" +
              "            \"rawData\": [\"43.88\", \"46.455\", \"45.081\", \"15.446\", \"15.805\", \"15.416\", \"129.533\", \"194.209\", \"172.877\", \"101.199\", \"222.857\", \"129.206\", \"188.355\", \"212.989\", \"9.633\", \"16.486\", \"-86.66\", \"-129.887\", \"-128.943\", \"-86.684\", \"-198.217\", \"-143.799\", \"53.723\", \"53.655\", \"53.073\", \"-15.674\", \"-14.746\", \"-13.973\", \"150\", \"50\", \"150\", \"50\", \"-2.75\", \"-2.65\", \"-5.45\", \"-2.98\", \"-2.82\"],\n" +
              "            \"tubeNum\": \"2\"\n" +
              "        }, {\n" +
              "            \"Params\": [{\n" +
              "                    \"param\": \"Recipe\",\n" +
              "                    \"value\": null\n" +
              "                }, {\n" +
              "                    \"param\": \"Tester\",\n" +
              "                    \"value\": \"TEST01\"\n" +
              "                }, {\n" +
              "                    \"param\": \"BINNO\",\n" +
              "                    \"value\": \"1\"\n" +
              "                }, {\n" +
              "                    \"param\": \"P\\/F\",\n" +
              "                    \"value\": \"P\"\n" +
              "                }\n" +
              "            ],\n" +
              "            \"parameter\": [\"Eff_3.4G(%)\", \"Eff_3.5G(%)\", \"Eff_3.6G(%)\", \"Gain_3.4G(dB)\", \"Gain_3.5G(dB)\", \"Gain_3.6G(dB)\", \"Id_Carrier(mA)\", \"Id_Peak(mA)\", \"Idleak_Carrier_150V(uA)\", \"Idleak_Carrier_50V(uA)\", \"Idleak_Peak_150V(uA)\", \"Idleak_Peak_50V(uA)\", \"Idsq_Carrier(mA)\", \"Idsq_Peak(mA)\", \"Idth_Carrier(mA)\", \"Idth_Peak(mA)\", \"Ig_Carrier(uA)\", \"Ig_Peak(uA)\", \"Igleak_Carrier_150V(uA)\", \"Igleak_Carrier_50V(uA)\", \"Igleak_Peak_150V(uA)\", \"Igleak_Peak_50V(uA)\", \"Psat_3.4G(dBm)\", \"Psat_3.5G(dBm)\", \"Psat_3.6G(dBm)\", \"RL_3.4G(dB)\", \"RL_3.5G(dB)\", \"RL_3.6G(dB)\", \"Vbr_Carrier_150V(V)\", \"Vbr_Carrier_50V(V)\", \"Vbr_Peak_150V(V)\", \"Vbr_Peak_50V(V)\", \"Vgsq_Carrier(V)\", \"Vgsq_Peak(V)\", \"Vgsq_Peak_offseted(V)\", \"Vth_Carrier(V)\", \"Vth_Peak(V)\"],\n" +
              "            \"rawData\": [\"44.111\", \"45.729\", \"43.405\", \"15.191\", \"15.37\", \"14.914\", \"129.502\", \"199.634\", \"163.795\", \"73.212\", \"214.905\", \"103.315\", \"188.272\", \"219.917\", \"10.454\", \"16.934\", \"-52.345\", \"-91.964\", \"-74.312\", \"-54.029\", \"-141.43\", \"-102.429\", \"53.713\", \"53.663\", \"53.128\", \"-13.601\", \"-12.398\", \"-10.362\", \"150\", \"50\", \"150\", \"50\", \"-2.62\", \"-2.71\", \"-5.51\", \"-2.86\", \"-2.88\"],\n" +
              "            \"tubeNum\": \"1\"\n" +
              "        }\n" +
              "    ],\n" +
              "    \"eqpId\": \"PTDT01\",\n" +
              "    \"lotId\": \"D2224003\",\n" +
              "    \"materialBoxBarcode\": [],\n" +
              "    \"materialInfo\": [],\n" +
              "    \"operId\": \"nxadmin\",\n" +
              "     \"outputList\": [{\n" +
              "            \"inputQty\": [],\n" +
              "            \"output\": \"304\",\n" +
              "            \"reasonList\": [],\n" +
              "            \"type\": \"Normal\"\n" +
              "        }\n" +
              "    ],\n" +
              "    \"remark\": null,\n" +
              "    \"testerId\": \"TEST01\"\n" +
              "}\n";

//      System.out.println(trackOutStr);
      String summer = autoTrackOutService.autoTrackOutService(trackOutStr);
      System.out.println(summer);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}
