package com.xiaohe.mamono;

import com.xiaohe.mamono.comm.CommArgs;
import com.xiaohe.mamono.util.SysConf;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class MamonoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MamonoApplication.class, args);
        //System.out.println(run.getBean(SysConf.class).getProperties("country.name"));
    }

}
