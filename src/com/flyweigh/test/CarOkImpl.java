package com.flyweigh.test;

/**
 * @ProjectName: flyweight
 * @Package: com.flyweigh.test
 * @ClassName: CarOkImpl
 * @Description: 共享部分
 * @Author: Ni Shichao
 * @Version: 1.0
 */
public class CarOkImpl implements Car {

    public Car car;

    public CarOkImpl(Car car) {
        this.car = car;
    }

    @Override
    public void rideCar(String userName) {
        if (null == car) {
            System.out.println("附近没有单车可骑");
        } else {
            car.rideCar(userName);
        }

    }
}
