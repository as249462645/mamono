package com.xiaohe.mamono.generator;

import com.xiaohe.mamono.comm.CommArgs;
import com.xiaohe.mamono.dao.CountryMapper;
import com.xiaohe.mamono.entity.Area;
import com.xiaohe.mamono.entity.Country;
import com.xiaohe.mamono.entity.modal.MamonoMap;
import com.xiaohe.mamono.properties.CountryProperties;
import com.xiaohe.mamono.properties.MapProperties;
import com.xiaohe.mamono.util.RandomUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class CountryGenerator {

    @Autowired
    private CountryMapper countryMapper;

    @Autowired
    private CountryProperties countryProperties;

    @Autowired
    private MapProperties mapProperties;

    @Autowired
    private AreaGenerator areaGenerator;

    public static List<Country> countrys = Collections.synchronizedList(new ArrayList<>());

    public CountryGenerator(MamonoMap[][] mamonoMap) {
        if (isBadSize()) {
            throw new RuntimeException("配置文件map的长和高不能小于1");
        }
        mamonoMap = new MamonoMap[mapProperties.getHeight()][mapProperties.getLength()];
    }

    public CountryGenerator(MamonoMap[][] mamonoMap, int height, int length) {
        mamonoMap = new MamonoMap[height][length];
    }

    public void randomInitCountryOfMap(MamonoMap[][] mamonoMap) {
        if (mamonoMap == null) {
            if (isBadSize()) {
                throw new RuntimeException("配置文件map的长和高不能小于1");
            }
            mamonoMap = new MamonoMap[mapProperties.getHeight()][mapProperties.getLength()];
        }
        int height = mamonoMap.length;
        int length = mamonoMap[0].length;
        initCountry(mamonoMap,height,length);
    }

    private void initCountry(MamonoMap[][] mamonoMap,int height, int length) {
        int sizeTemp = height * length;
        if (countryProperties.getNumber() == 0) {
            //若未指定国家数量 随机产生 1~地图大小/3 个国家
            countryProperties.setNumber(countryNumberGenerator(sizeTemp / 3));
        }
        int countryCount = countryProperties.getNumber();
        for (int j = 0; j < countryCount; j++) {
            //一个国家的大小将随机生成：1 ~ （地图总大小-当前未生成国家数量*3）
            int oneOfCountrySize = RandomUtil.getRandomInt(1, sizeTemp - (countryCount - j) * 3);
            Country country = generatorCountry(oneOfCountrySize);
            countrys.add(country);
            areaGenerator.areaGenerator(mamonoMap,oneOfCountrySize,country.getId());
        }

    }

    private Country generatorCountry(int size) {
        Country country = new Country();
        country.setName(CommArgs.COUNTRY_STACK.pop());
        country.setSize(size);
        //todo
        //country.setKind();
        //保存到数据库并将id回设
        country.setId(countryMapper.insert(country));
        return country;
    }

    private int countryNumberGenerator(int size) {
        return RandomUtil.getRandomInt(1, size);
    }

    private boolean isBadSize() {
        return mapProperties.getHeight() < 1 || mapProperties.getLength() < 1;
    }

}
