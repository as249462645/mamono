package com.xiaohe.mamono.generator;

import com.xiaohe.mamono.entity.modal.Map;
import com.xiaohe.mamono.properties.CountryProperties;
import com.xiaohe.mamono.properties.MapProperties;
import com.xiaohe.mamono.util.RandomUtil;
import org.springframework.beans.factory.annotation.Autowired;

public class CountryGenerator {

    @Autowired
    private CountryProperties countryProperties;

    @Autowired
    private MapProperties mapProperties;

    public CountryGenerator(Map[][] map) {
        if (isBadSize()) {
            throw new RuntimeException("配置文件map的长和高不能小于1");
        }
        map = new Map[mapProperties.getHeight()][mapProperties.getLength()];
    }

    public CountryGenerator(Map[][] map, int height, int length) {
        map = new Map[height][length];
    }

    public void randomInitCountryOfMap(Map[][] map) {
        if (map == null) {
            if (isBadSize()) {
                throw new RuntimeException("配置文件map的长和高不能小于1");
            }
            map = new Map[mapProperties.getHeight()][mapProperties.getLength()];
        }
        int height = map.length;
        int length = map[0].length;

    }

    private void initCountry(int height, int length) {
        int sizeTemp = height * length;
        if (countryProperties.getNumber() != 0) {
            countryProperties.setNumber(countryNumberGenerator(sizeTemp));
        }
        for (int i = 0; i < sizeTemp; i++) {
            int countrySize = RandomUtil.getRandomInt(1, sizeTemp);
            sizeTemp -= countrySize;

            for(int j = 0; j < countrySize;j++){

            }

        }
    }

    private int countryNumberGenerator(int size) {
        return RandomUtil.getRandomInt(1, size);
    }

    private boolean isBadSize() {
        return mapProperties.getHeight() < 1 || mapProperties.getLength() < 1;
    }

}
