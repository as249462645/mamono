package com.xiaohe.mamono.generator;

import com.xiaohe.mamono.comm.CommArgs;
import com.xiaohe.mamono.dao.CountryMapper;
import com.xiaohe.mamono.entity.Country;
import com.xiaohe.mamono.entity.modal.MamonoMap;
import com.xiaohe.mamono.properties.CountryProperties;
import com.xiaohe.mamono.util.RandomUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CountryGenerator {

    @Autowired
    private CountryMapper countryMapper;

    public static List<Country> countrys = Collections.synchronizedList(new ArrayList<>());

    private List<Integer> countrySizeList;

    private Integer countrySize;

    private Integer countryNumber;

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
        doGenaretorCountry(mapSize);
    }

    public void doGenaretorCountry(int mapSize) {
        if (countryNumber == 0) {
            //若未指定国家数量 随机产生 1~地图大小/3 个国家
            countryNumber = RandomUtil.getRandomInt(1, mapSize / 3);
        }
        for (int j = 0; j < countryNumber; j++) {
            if (countrySizeList != null) {
                countrySize = countrySizeList.get(j);
            }
            if (countrySize == 0 || countrySize == null) {
                //一个国家的大小将随机生成：1 ~ （地图总大小-当前未生成国家数量*3）
                countrySize = RandomUtil.getRandomInt(1, mapSize - (countryNumber - j) * 3);
            }
            Country country = getCountry(countrySize);
            countrys.add(country);
        }
        clear();
    }

    private void clear() {
        this.countryNumber = null;
        this.countrySizeList = null;
        this.countrySize = null;
    }

    private Country getCountry(int size) {
        Country country = new Country();
        country.setName(CommArgs.COUNTRY_STACK.pop());
        country.setSize(size);
        //todo
        //country.setKind();
        //保存到数据库并将id回设
        country.setId(countryMapper.insert(country));
        return country;
    }


}
