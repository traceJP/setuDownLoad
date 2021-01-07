package com.traceJP.setu;

import com.alibaba.fastjson.JSONObject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

public class Util {

    /**
     * 获取config值
     * @param key config值
     * @return String value
     */
    public static String getProperties(String key) {
        Properties prop = new Properties();
        try {
            FileInputStream fis = new FileInputStream("src/main/resources/config.properties");
            prop.load(fis);
            return prop.getProperty(key);
        } catch (IOException e) {
            e.printStackTrace();
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 将json转化为JavaBean
     * @param jsonData
     * @return
     */
    public static Model getJsonBean(String jsonData) {
        return JSONObject.parseObject(jsonData, Model.class);
    }


}
