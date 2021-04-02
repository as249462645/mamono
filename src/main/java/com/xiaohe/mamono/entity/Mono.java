package com.xiaohe.mamono.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Mono {
    private Integer id;

    private String name;

    private Float pa;

    private Float ma;

    private Float pd;

    private Float md;

    private Integer hp;

    private Integer mp;

    private Float maxHp;

    private Float maxMp;

    private Integer master;

    private Integer countryId;

    private Integer raceId;

    private Integer dispositionId;

    private Integer growId;

    private Integer moodId;

    private Long greateTime;

    private Integer status;

    private Integer isLive;

    private Long lifetime;

    private Integer lv;

    private Integer empirical;

    private String nextLvEmp;

    private Integer positionId;

    }