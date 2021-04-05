package com.xiaohe.mamono.comm;

import com.xiaohe.mamono.util.SysConf;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component()
public class CommArgs {


    private Environment environment;

    @Autowired
    public CommArgs(Environment environment){
        this.environment = environment;
        inti();
    }

    public static Stack<String> COUNTRY_STACK;


    private void inti(){
        countryStackInit();
    }

    private void countryStackInit(){
        String country = environment.getProperty("country.name");
        List<String> list = Arrays.asList(country.split("、"));
        Collections.shuffle(list);
        COUNTRY_STACK = new Stack<>();
        COUNTRY_STACK.addAll(list);
    }

}
