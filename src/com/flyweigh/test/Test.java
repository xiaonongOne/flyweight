package com.flyweigh.test;

/**
 * @ProjectName: flyweight
 * @Package: com.flyweigh.test
 * @ClassName: Test
 * @Description:
 * @Author: Xiao Nong
 * @Version: 1.0
 */
public class Test {

    public static void main(String[] args) {

       CarFactory carFactory = new CarFactory();
       Car car1 = carFactory.getCar("红色",new CarNoImpl());
       car1.rideCar("小明");

       Car car2 = carFactory.getCar("蓝色",new CarNoImpl());
       car2.rideCar("小王");

       Car car3 = carFactory.getCar("红色",new CarNoImpl());
       car3.rideCar("小李");

       System.out.println("=========================================");

       Car car4 = carFactory.getCar("黑色",new CarOkImpl(null));
       car4.rideCar("小王");

    }
}
