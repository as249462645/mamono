package com.xiaohe.mamono.generator;

import com.xiaohe.mamono.comm.ArrayCom;
import com.xiaohe.mamono.dao.AreaMapper;
import com.xiaohe.mamono.entity.Area;
import com.xiaohe.mamono.entity.modal.AreaModalOfMap;
import com.xiaohe.mamono.entity.modal.MamonoMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AreaGenerator {

    @Autowired
    public AreaMapper areaMapper;

    private Queue<String> queue = new LinkedList<String>();

    public static List<Area> areas = Collections.synchronizedList(new ArrayList<>());

    private List<Integer> arrayIndexlist = new ArrayList<Integer>(){};

    public AreaGenerator() {
    }


    public AreaModalOfMap areaGenerator(int x, int y, int countryId) {
        AreaModalOfMap area = new AreaModalOfMap();
        area.setX(x);
        area.setY(y);
        area.setCountryId(countryId);
        areas.add(area);
        areaMapper.insert(area);
        return area;
    }

    public int areaGenerator(int maxNumber,int number, MamonoMap[][] mamonoMap, int length, int height,int countryId) {
        if (number == maxNumber || length == mamonoMap.length || height == mamonoMap[0].length || length < 0 || height < 0) {
            return number - 1;
        }
        if(mamonoMap[length][height].getArea() != null){
            return number - 1;
        }
        AreaModalOfMap areaModalOfMap = (AreaModalOfMap)areaGenerator(length,height,countryId);
        mamonoMap[length][height].setArea(areaModalOfMap);
        //随机方向
        arrayIndexGenerator();
        boolean flag = false;
        number += 1;
        for (int i = 0; i < ArrayCom.arrayEight.length; i++) {
            int x = length + ArrayCom.arrayEight[arrayIndexlist.get(i)][0];
            int y = height + ArrayCom.arrayEight[arrayIndexlist.get(i)][1];

            int t = areaGenerator(maxNumber,number, mamonoMap,x,y,countryId);
            if (t > number - 1) {
                return t;
            }
        }
        return number;
    }

    public void areaGenerator(MamonoMap[][] mamonoMap,int size,int countryId){
        for (int i = 0; i < mamonoMap.length; i++) {
            for (int j = 0; j < mamonoMap[0].length; j++) {
                if(mamonoMap[i][j].getArea() == null){
                    int currentSize = 0;
                    currentSize = areaGenerator(size,currentSize, mamonoMap,i,j,countryId);
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
        MamonoMap[][] mamonoMap = new MamonoMap[5][5];
        for (int i = 0; i < mamonoMap.length; i++) {
            for (int j = 0; j < mamonoMap.length; j++) {
                mamonoMap[i][j] = new MamonoMap();
            }
        }
        for(int i = 0;i<1;i++) {
            areaGenerator.areaGenerator(mamonoMap, 15,1);
            System.out.println("结果");
            areaGenerator.print(mamonoMap);
        }

    }

    public void print(MamonoMap[][] mamonoMap){
        for (int i = 0; i < mamonoMap.length; i++) {
            for (int j = 0; j < mamonoMap.length; j++) {
                System.out.print(mamonoMap[i][j].getArea() == null?"0"+"\t":"1"+"\t" );
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

    }

}
