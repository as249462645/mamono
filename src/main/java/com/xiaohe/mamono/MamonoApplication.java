package com.xiaohe.mamono;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MamonoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MamonoApplication.class, args);
        //System.out.println(run.getBean(SysConf.class).getProperties("country.name"));
    }

}
