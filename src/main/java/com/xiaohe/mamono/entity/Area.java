package com.xiaohe.mamono.entity;

public class Area {
    private Integer id;

    private Integer x;

    private Integer y;

    private Integer countryId;

    private Integer landformId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public Integer getLandformId() {
        return landformId;
    }

    public void setLandformId(Integer landformId) {
        this.landformId = landformId;
    }
}