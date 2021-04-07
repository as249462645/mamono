package com.xiaohe.mamono.controller.test;

import com.xiaohe.mamono.entity.modal.MamonoMap;
import com.xiaohe.mamono.generator.CountryGenerator;
import com.xiaohe.mamono.generator.MapGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    CountryGenerator countryGenerator;

    @Autowired
    MapGenerator mapGenerator;

    @RequestMapping("testCountryGenerator")
    public void testCountryGenerator(){
        MamonoMap[][] map = mapGenerator.getMap();
        countryGenerator.generatorCountry(map);
    }
}
