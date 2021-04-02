package com.xiaohe.mamono.entity.modal;

import com.xiaohe.mamono.entity.Area;
import com.xiaohe.mamono.entity.Landform;
import lombok.Data;

@Data
public class AreaModalOfMap extends Area {

    private Landform landform;
}
