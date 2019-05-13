package com.test;

/**
 * @ProjectName: flyweight
 * @Package: com.test
 * @ClassName: Bicycle
 * @Description: 自行车类
 * @Author: Xiao Nong
 * @Version: 1.0
 */
public class Bicycle {

    private  String name;

    public Bicycle (String name) {
        this.name = name;
    }

    public void  rideBicycle () {
        System.out.println(name+" 骑自行车");
    }

}
