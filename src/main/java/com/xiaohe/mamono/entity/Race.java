package com.xiaohe.mamono.entity;

public class Race {
    private Integer id;

    private String name;

    private Long lifetimeMin;

    private Long lifetimeMan;

    private Integer fatherRaceId;

    private Integer motherRaceid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getLifetimeMin() {
        return lifetimeMin;
    }

    public void setLifetimeMin(Long lifetimeMin) {
        this.lifetimeMin = lifetimeMin;
    }

    public Long getLifetimeMan() {
        return lifetimeMan;
    }

    public void setLifetimeMan(Long lifetimeMan) {
        this.lifetimeMan = lifetimeMan;
    }

    public Integer getFatherRaceId() {
        return fatherRaceId;
    }

    public void setFatherRaceId(Integer fatherRaceId) {
        this.fatherRaceId = fatherRaceId;
    }

    public Integer getMotherRaceid() {
        return motherRaceid;
    }

    public void setMotherRaceid(Integer motherRaceid) {
        this.motherRaceid = motherRaceid;
    }
}