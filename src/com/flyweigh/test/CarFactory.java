package com.flyweigh.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @ProjectName: flyweight
 * @Package: com.flyweigh.test
 * @ClassName: CarFactory
 * @Description: 汽车工厂类
 * @Author: Xiao Nong
 * @Version: 1.0
 */
public class CarFactory {
    //  享元池
    //  如果找到了，不需要创建新的对象。包含了两个意思，第一个意思：减少了对象的创建，第二个,提高了对象的重复利用。
    private static Map<String,Object> filweighs = new HashMap<String,Object>();

    public Car getCar(String key,Car car) {
        if (!filweighs.containsKey(key)) {
            filweighs.put(key, car);
        }
        return (Car) filweighs.get(key);
    }

}
