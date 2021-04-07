package com.xiaohe.mamono.controller.test;

import com.xiaohe.mamono.dao.CountryMapper;
import com.xiaohe.mamono.entity.Country;
import com.xiaohe.mamono.generator.MapGenerator;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryManagerTest {

    @Autowired
    CountryMapper countryMapper;


    @RequestMapping("testInsert")
    public String testInsert(){
        Country country = new Country();
        country.setSize(20);
        country.setName("test");
        int id = countryMapper.insert(country);
        return id + "";
    }
}
