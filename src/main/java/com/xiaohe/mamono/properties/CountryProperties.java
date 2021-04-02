package com.xiaohe.mamono.properties;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "county")
public class CountryProperties {

    private Integer number;

    private Integer minSize;

    private Integer maxSize;

}
