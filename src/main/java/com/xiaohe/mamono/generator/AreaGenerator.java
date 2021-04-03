package com.xiaohe.mamono.generator;

import com.xiaohe.mamono.comm.ArrayCom;
import com.xiaohe.mamono.dao.AreaMapper;
import com.xiaohe.mamono.entity.Area;
import com.xiaohe.mamono.entity.modal.AreaModalOfMap;
import com.xiaohe.mamono.entity.modal.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import org.springframework.beans.factory.annotation.Autowired;

public class AreaGenerator {

    @Autowired
    public static AreaMapper areaMapper;

    private Queue<String> queue = new LinkedList<String>();

    public static List<Area> areas = Collections.synchronizedList(new ArrayList<>());

    private List<Integer> arrayIndexlist = new ArrayList<Integer>(){};

    public AreaGenerator() {
        init();
    }

    private void init() {

    }

    public static Area areaGenerator(int x, int y, int countryId) {
        Area area = new Area();
        area.setX(x);
        area.setY(y);
        area.setCountryId(countryId);
        areas.add(area);
        areaMapper.insert(area);
        return area;
    }

    public int areaGenerator(int maxNumber,int number, Map[][] map, int length, int height,int countryId) {
        if (number == maxNumber || length == map.length || height == map[0].length || length < 0 || height < 0) {
            return number - 1;
        }
        if(map[length][height].getArea() != null){
            return number - 1;
        }
        AreaModalOfMap areaModalOfMap = new AreaModalOfMap();
        areaModalOfMap.setCountryId(countryId);
        areaModalOfMap.setX(length);
        areaModalOfMap.setY(height);
//        int areaId = areaMapper.insert(areaModalOfMap);
//        areaModalOfMap.setId(areaId);
        map[length][height].setArea(areaModalOfMap);
        print(map);
        arrayIndexGenerator();
        boolean flag = false;
        number += 1;
        for (int i = 0; i < ArrayCom.arrayEight.length; i++) {
            int x = length + ArrayCom.arrayEight[arrayIndexlist.get(i)][0];
            int y = height + ArrayCom.arrayEight[arrayIndexlist.get(i)][1];

            int t = areaGenerator(maxNumber,number,map,x,y,countryId);
            if (t > number - 1) {
                return t;
            }
        }
        return number;
    }

    public void areaGenerator(Map[][] map,int size){
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if(map[i][j].getArea() == null){
                    int currentSize = 0;
                    currentSize = areaGenerator(size,currentSize,map,i,j,0);
                    if(currentSize >=size)
                        return;
                }
            }
        }
    }

    private void arrayIndexGenerator(){
        if(arrayIndexlist.size() == 0){
            for(int i = 0 ;i<8;i++)
                arrayIndexlist.add(i);
        }
        Collections.shuffle(arrayIndexlist);
    }

    public static void main(String[] args) {
        AreaGenerator areaGenerator = new AreaGenerator();
        Map[][] map = new Map[5][5];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                map[i][j] = new Map();
            }
        }
        for(int i = 0;i<1;i++) {
            areaGenerator.areaGenerator(map, 15);
            System.out.println("结果");
            areaGenerator.print(map);
        }

    }

    public void print(Map[][] map){
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                System.out.print(map[i][j].getArea() == null?"0"+"\t":"1"+"\t" );
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

    }

}
