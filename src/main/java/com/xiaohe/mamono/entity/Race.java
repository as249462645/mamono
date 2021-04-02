package com.xiaohe.mamono.entity;

import lombok.Data;

@Data
public class Race {
    private Integer id;

    private String name;

    private Long lifetimeMin;

    private Long lifetimeMan;

    private Integer fatherRaceId;

    private Integer motherRaceid;

    }