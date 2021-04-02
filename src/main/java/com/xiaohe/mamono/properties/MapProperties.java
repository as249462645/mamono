package com.xiaohe.mamono.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties(prefix = "map")
@Data
public class MapProperties {

    private Integer height;

    private Integer length;
}
