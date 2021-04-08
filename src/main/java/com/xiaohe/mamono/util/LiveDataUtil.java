package com.xiaohe.mamono.util;

import static com.xiaohe.mamono.util.RandomUtil.getRandomInt;

public class LiveDataUtil {

    public static final long minute = 1000 * 60;

    public static Long minLiveTime(int quality){
        return (RandomUtil.getRandomInt(quality * 3,quality * 10) + 20) * minute;
    }

    public static long maxLiveTime(int quality,long minLiveTime){
        return RandomUtil.getRandomInt(minLiveTime,minLiveTime + minLiveTime /quality);
    }
}
