package com.xiaohe.mamono.controller;

import com.xiaohe.mamono.entity.modal.MamonoMap;
import com.xiaohe.mamono.generator.CountryGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @Autowired
    CountryGenerator generator;

    @RequestMapping("testCountryGenerator")
    public void testCountryGenerator(){
        MamonoMap[][] map = new MamonoMap[10][10];
        generator.generatorCountry(map);
    }
}
