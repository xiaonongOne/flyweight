package com.flyweigh.test;

/**
 * @ProjectName: flyweight
 * @Package: com.flyweigh.test
 * @ClassName: CarNoImpl
 * @Description: 非共享部分
 * @Author: Xiao Nong
 * @Version: 1.0
 */
public class CarNoImpl implements Car {

    @Override
    public void rideCar(String userName) {
        System.out.println(userName+"开汽车");
    }
}