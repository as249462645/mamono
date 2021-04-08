package com.xiaohe.mamono.generator;

import com.xiaohe.mamono.comm.CommArgs;
import com.xiaohe.mamono.dao.CountryMapper;
import com.xiaohe.mamono.entity.Country;
import com.xiaohe.mamono.entity.modal.MamonoMap;
import com.xiaohe.mamono.util.RandomUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CountryGenerator {

    @Autowired
    AreaGenerator areaGenerator;

    @Autowired
    private CountryMapper countryMapper;

    public static List<Country> countrys = Collections.synchronizedList(new ArrayList<>());

    private List<Integer> countrySizeList;

    private int countrySize;

    private int countryNumber;

    public CountryGenerator() {

    }

    /**
     * 若countrySizeList.size() < countryNumber ，则后续国家视为随机生成大小
     *
     * @param mamonoMap       地图
     * @param countryNumber   生成countryNumber个国家
     * @param countrySizeList 第i个国家大小就是countrySizeList.get(i)个
     */
    public void generatorCountry(MamonoMap[][] mamonoMap, int countryNumber, List<Integer> countrySizeList) {
        this.countrySizeList = countrySizeList;
        int autoNumber = countryNumber - countrySizeList.size();
        for (int i = 0; i < autoNumber; i++) {
            countrySizeList.add(0);
        }
        generatorCountry(mamonoMap, countryNumber);
    }

    /**
     * @param mamonoMap       地图
     * @param countrySizeList 生成countrySizeList.size()个国家，第i个国家大小就是countrySizeList.get(i)个
     */
    public void generatorCountry(MamonoMap[][] mamonoMap, List<Integer> countrySizeList) {
        this.countrySizeList = countrySizeList;
        generatorCountry(mamonoMap, countrySizeList.size());
    }

    public void generatorCountry(MamonoMap[][] mamonoMap, int countryNumber, int countrySize) {
        this.countrySize = countrySize;
        generatorCountry(mamonoMap, countryNumber);
    }

    public void generatorCountry(MamonoMap[][] mamonoMap, int countryNumber) {
        this.countryNumber = countryNumber;
        generatorCountry(mamonoMap);
    }

    public void generatorCountry(MamonoMap[][] mamonoMap) {
        int mapSize = mamonoMap.length * mamonoMap[0].length;
        doGenaretorCountry(mamonoMap,mapSize);
    }

    public void doGenaretorCountry(MamonoMap[][] mamonoMap , int mapSize) {
        if (countryNumber == 0) {
            //若未指定国家数量 随机产生 1~地图大小/3 个国家
            countryNumber = RandomUtil.getRandomInt(1, mapSize / 5);
        }
        for (int j = 0; j < countryNumber; j++) {
            mapSize -= doGenaretorCountry(j,mapSize);
        }
        clear();
        countryAreaInit(mamonoMap);
    }

    private int doGenaretorCountry(int j,int mapSize){
        int tempCountrySize = 0;
        if (countrySizeList != null) {
            tempCountrySize = countrySizeList.get(j);
        }
        if (countrySize == 0) {
            //一个国家的大小将随机生成：1 ~ （地图总大小-当前未生成国家数量*3）
            tempCountrySize = RandomUtil.getRandomInt(1, mapSize - (countryNumber - j) * 5);
        }
        //剩余地图大小
        Country country = getCountry(tempCountrySize);
        countrys.add(country);
        return tempCountrySize;
    }

    private void clear() {
        this.countryNumber = 0;
        this.countrySizeList = null;
        this.countrySize = 0;
    }

    private void countryAreaInit(MamonoMap[][] mamonoMap){
        countrys.forEach(country -> {
            areaGenerator.areaGenerator(mamonoMap,country.getSize(),country.getId());
        });
    }

    private Country getCountry(int size) {
        Country country = new Country();
        country.setName(CommArgs.COUNTRY_STACK.pop());
        country.setSize(size);
        //todo
        //country.setKind();
        //保存到数据库并将id回设
        countryMapper.insert(country);
        return country;
    }


}
