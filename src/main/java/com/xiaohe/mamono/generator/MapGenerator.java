package com.xiaohe.mamono.generator;

import com.xiaohe.mamono.entity.modal.MamonoMap;
import com.xiaohe.mamono.properties.CountryProperties;
import com.xiaohe.mamono.properties.MapProperties;
import org.springframework.beans.factory.annotation.Autowired;

public class MapGenerator {

    @Autowired
    private CountryProperties countryProperties;

    @Autowired
    private MapProperties mapProperties;


    public MapGenerator(MamonoMap[][] mamonoMap){
        if(isBadSize()){
            throw new RuntimeException("配置文件map的长和高不能小于1");
        }
        mamonoMap = new MamonoMap[mapProperties.getHeight()][mapProperties.getLength()];
    }

    public MapGenerator(MamonoMap[][] mamonoMap, int height , int length){
        mamonoMap = new MamonoMap[height][length];
    }

    public void randomInitCountryOfMap(MamonoMap[][] mamonoMap){
        if(mamonoMap == null){
            if(isBadSize()){
                throw new RuntimeException("配置文件map的长和高不能小于1");
            }
            mamonoMap = new MamonoMap[mapProperties.getHeight()][mapProperties.getLength()];
        }
        int height = mamonoMap.length;
        int length = mamonoMap[0].length;

    }

    private void initCountry(int size , int monoId ){

    }

    private boolean isBadSize(){
        return mapProperties.getHeight() < 1 || mapProperties.getLength() <1;
    }
}
