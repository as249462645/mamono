package com.xiaohe.mamono.generator;

import com.xiaohe.mamono.entity.modal.Map;
import com.xiaohe.mamono.properties.CountryProperties;
import com.xiaohe.mamono.properties.MapProperties;
import org.springframework.beans.factory.annotation.Autowired;

public class MapGenerator {

    @Autowired
    private CountryProperties countryProperties;

    @Autowired
    private MapProperties mapProperties;


    public MapGenerator(Map[][] map){
        if(isBadSize()){
            throw new RuntimeException("配置文件map的长和高不能小于1");
        }
        map = new Map[mapProperties.getHeight()][mapProperties.getLength()];
    }

    public MapGenerator(Map[][] map , int height , int length){
        map = new Map[height][length];
    }

    public void randomInitCountryOfMap(Map[][] map){
        if(map == null){
            if(isBadSize()){
                throw new RuntimeException("配置文件map的长和高不能小于1");
            }
            map = new Map[mapProperties.getHeight()][mapProperties.getLength()];
        }
        int height = map.length;
        int length = map[0].length;

    }

    private void initCountry(int size , int monoId ){

    }

    private boolean isBadSize(){
        return mapProperties.getHeight() < 1 || mapProperties.getLength() <1;
    }
}
