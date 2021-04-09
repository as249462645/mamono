package com.xiaohe.mamono.util;

import com.xiaohe.mamono.entity.Mono;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

public class MonoUtil {

    /**
     * 判断N个对象的相同字段的值是否相同
     * 将properties参数造成成对象的get方法，再利用反射调用对象的get方法
     * @param properties 对象的属性，对象必须为属性编写get方法
     * @param obj
     * @return true为相同
     */
    public static boolean isSomeProperties(String properties, Object... obj) {
        String methodName ="get"+properties.substring(0,1).toUpperCase() + properties.substring(1);
        Class<?>  clazz = null;
        String propertiesValue = "";
        for(Object o : obj){
            try {
                clazz = o.getClass();
                Method method = clazz.getMethod(methodName);
                String propertiesValueTemp = String.valueOf(method.invoke(o));
                if("".equals(propertiesValue)){
                    propertiesValue = propertiesValueTemp;
                }else if(!propertiesValueTemp.equals(propertiesValue)){
                    return false;
                }
            }catch (Exception e){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Mono m1 = new Mono();
        m1.setName("zz");
        Mono m2 = new Mono();
        m2.setName("zz");
        Mono m3 = new Mono();
        m3.setName("zz");
        boolean res = MonoUtil.isSomeProperties("name",m1,m2,m3);
        System.out.println(res);
    }

}
