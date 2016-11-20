package com.SimINTE.edu.deeplearning.recurrent.prediction.airportstation;

import org.apache.commons.io.IOUtils;
import org.datavec.api.util.ClassPathResource;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Yukai Ji on 2016/11/20.
 */
public class CSVLoaderUtils {

    public static Map<Integer,String> readCSV(String csvFileClasspath) {
        try{
            List<String> lines = IOUtils.readLines(new ClassPathResource(csvFileClasspath).getInputStream());
            Map<Integer,String> enums = new HashMap<>();

            for(String line:lines){
                String[] parts = line.split(",");
                enums.put(Integer.parseInt(parts[0]),parts[1]);
            }
            return enums;
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }
}
