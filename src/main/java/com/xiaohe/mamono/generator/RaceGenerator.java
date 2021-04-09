package com.xiaohe.mamono.generator;

import com.xiaohe.mamono.dao.RaceMapper;
import com.xiaohe.mamono.entity.Race;
import com.xiaohe.mamono.util.LiveDataUtil;
import com.xiaohe.mamono.util.MyConllectionUtil;
import com.xiaohe.mamono.util.RandomUtil;
import com.xiaohe.mamono.util.SysConf;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RaceGenerator {

    @Autowired
    private RaceMapper raceMapper;

    private List<String> raceNameList;

    private List<Race> raceList;

    public RaceGenerator(){
        raceListInit();
        initRace(raceNameList);
    }

    private void raceListInit(){
        String races = SysConf.getProperties("mamono.race");
        raceNameList = MyConllectionUtil.createList(races);
        raceList = new ArrayList<>();
    }

    private void initRace(List<String> raceNameList){
        raceNameList.forEach(raceName -> {
            Race race = getRace(raceName);
            raceMapper.insert(race);
            raceList.add(race);
        });
    }

    public Race getRace(String raceName){
        Race race = new Race();
        race.setName(raceName);
        race.setQuality(RandomUtil.getRandomInt(1,9));
        race.setLifetimeMin(LiveDataUtil.minLiveTime(race.getQuality()));
        race.setLifetimeMax(LiveDataUtil.maxLiveTime(race.getQuality(),race.getLifetimeMin()));
        return race;
    }

}
