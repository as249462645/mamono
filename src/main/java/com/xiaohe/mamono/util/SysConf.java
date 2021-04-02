package com.xiaohe.mamono.util;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component("sysConf")
public class SysConf {
    private static Environment environment;

    public static String getProperties(String key){
        return environment.getProperty(key);
    }

    public static int getIntProperties(String key,int defaultValue){
        String value = environment.getProperty(key);
        return StringUtils.isEmpty(value) ? defaultValue : Integer.parseInt(value);
    }
}
