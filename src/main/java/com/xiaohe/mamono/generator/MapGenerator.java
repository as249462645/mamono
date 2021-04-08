package com.xiaohe.mamono.generator;

import com.xiaohe.mamono.entity.modal.MamonoMap;
import com.xiaohe.mamono.properties.MapProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MapGenerator {

    public static int DEFAULT_MAP_SIZE = 100;

    @Autowired
    private MapProperties mapProperties;

    public MamonoMap[][] getMap() {
        if (verifyMapSize()) {
            return new MamonoMap[DEFAULT_MAP_SIZE][DEFAULT_MAP_SIZE];
        }
        return initMap(new MamonoMap[mapProperties.getHeight()][mapProperties.getLength()]);
    }

    public MamonoMap[][] getMap(int height, int length) {
        //如果数组长宽小于1
        if (verifyMapSize(height, length)) {
            return getMap();
        }
        return initMap(new MamonoMap[height][length]);
    }

    public MamonoMap[][] initMap(MamonoMap[][] map){
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                map[i][j] = new MamonoMap();
            }
        }
        return map;
    }

    private boolean verifyMapSize() {
        return mapProperties.getHeight() < 1 || mapProperties.getLength() < 1;
    }

    private boolean verifyMapSize(int height, int length) {
        return height < 1 || length < 1;
    }

}
