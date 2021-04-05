package com.xiaohe.mamono.entity.modal;

import com.xiaohe.mamono.entity.Mono;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component("mamonoMap")
public class MamonoMap {

    private AreaModalOfMap area;

    private Mono mono;

}
