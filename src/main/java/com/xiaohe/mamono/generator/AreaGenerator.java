package com.xiaohe.mamono.generator;

import com.xiaohe.mamono.dao.AreaMapper;
import com.xiaohe.mamono.entity.Area;
import com.xiaohe.mamono.entity.AreaExample;
import com.xiaohe.mamono.entity.modal.Map;
import com.xiaohe.mamono.util.RandomUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class AreaGenerator {

    @Autowired
    public static AreaMapper areaMapper;

    public static List<Area> areas = Collections.synchronizedList(new ArrayList<>());

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

//    public static boolean areaGenerator(int number, Map[][] map, int length, int height) {
//        if (number == 0 || length == map.length || height == map[0].length || length < 0 || height < 0) {
//            return false;
//        }
//        for (int i = 0; i < 8; i++) {
//
//        }
//        switch (RandomUtil.getRandomInt(1, 8)) {
//            case 1:
//                areaGenerator(number - 1, map, length + 1, height);
//                break;
//            case 2:
//                areaGenerator(number - 1, map, length - 1, height);
//                break;
//            case 3:
//                areaGenerator(number - 1, map, length + 1, height);
//                break;
//            case 4:
//                areaGenerator(number - 1, map, length + 1, height);
//                break;
//            case 5:
//                areaGenerator(number - 1, map, length + 1, height);
//                break;
//            case 6:
//                areaGenerator(number - 1, map, length + 1, height);
//                break;
//            case 7:
//                areaGenerator(number - 1, map, length + 1, height);
//                break;
//            case 8:
//                areaGenerator(number - 1, map, length + 1, height);
//                break;
//            default:
//                break;
//        }
//    }

}
