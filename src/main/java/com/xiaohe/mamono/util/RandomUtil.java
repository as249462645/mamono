package com.xiaohe.mamono.util;

import java.util.Random;

public class RandomUtil {

    private Random random = new Random();

    public static int getRandomInt(int min,int max){
        return (int)(min+Math.random()*(max-min+1));
    }

    public static int getRandomInt(long min,long max){
        return (int)(min+Math.random()*(max-min+1));
    }

}
