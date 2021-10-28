package DTO;

import com.alibaba.fastjson.JSON;
import org.apache.axis.utils.BeanUtils;

import java.util.ArrayList;
import java.util.List;

public class dataCollection {
    public static void main(String[] args) {

        DataCollectionDTO dataCollectionDTO = new DataCollectionDTO();
        dataCollectionDTO.setLotId("D2130001");
        dataCollectionDTO.setStepId("FDI");
        data data = new data();
        data.setParameter("APPEARANCEINSPECTION");
        List<tubeNumValue> tubeNumValues = new ArrayList<>();
        List<data> dataList = new ArrayList<>();
        tubeNumValue tubeNumValue = new tubeNumValue();
        List<String> val1 = new ArrayList<>();
        val1.add("1");
        tubeNumValue.setRawData(val1);
        tubeNumValue.setTubeNum("1");

        tubeNumValue tubeNumValue2 = new tubeNumValue();
        List<String> val2 = new ArrayList<>();
        val2.add("2");
        tubeNumValue2.setRawData(val2);
        tubeNumValue2.setTubeNum("2");

        tubeNumValue tubeNumValue3 = new tubeNumValue();
        List<String> val3 = new ArrayList<>();
        val3.add("3");
        tubeNumValue3.setRawData(val3);
        tubeNumValue3.setTubeNum("3");

        tubeNumValue tubeNumValue4 = new tubeNumValue();
        List<String> val4 = new ArrayList<>();
        val4.add("4");
        tubeNumValue4.setRawData(val4);
        tubeNumValue4.setTubeNum("4");

        tubeNumValues.add(tubeNumValue);
        tubeNumValues.add(tubeNumValue2);
        tubeNumValues.add(tubeNumValue3);
        tubeNumValues.add(tubeNumValue4);

        data.setTubeNumValue(tubeNumValues);
        dataList.add(data);
        dataCollectionDTO.setData(dataList);
        System.out.println(JSON.toJSONString(dataCollectionDTO));

    }
}
