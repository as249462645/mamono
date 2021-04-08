package com.xiaohe.mamono.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class MyConllectionUtil {

    /**
     * 将一个数组顺序打乱后放入一个栈中返回
     * @param t 一个数组
     * @param <T> 泛型类型
     * @return 返回一个栈
     */
    public static <T> Stack<T> createStack(T[] t){
        Stack<T> stack = new Stack<>();
        List<T> list = Arrays.asList(t);
        Collections.shuffle(list);
        stack.addAll(list);
        return stack;
    }

    /**
     * 将一个字符串转化为数组后顺序打乱放入一个栈中返回
     * @param str 一穿由'、'分割的字段串
     * @return 返回一个栈
     */
    public static Stack createStack(String str){
        return createStack(str.split("、"));
    }

    public static List createList(String str){
        String[] strArray = str.split("、");
        List list = Arrays.asList(strArray);
        Collections.shuffle(list);
        return list;
    }
}
