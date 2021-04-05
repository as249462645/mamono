package com.xiaohe.mamono.comm;

import com.xiaohe.mamono.MamonoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MamonoApplication.class, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class CountryArgsTest {

    @Test
    public void countryQueueTest(){
        for (int i = 0; i < CommArgs.COUNTRY_STACK.size(); i++) {
            System.out.println(CommArgs.COUNTRY_STACK.pop());
        }
    }
}
