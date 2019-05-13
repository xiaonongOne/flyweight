package com.test;

/**
 * @ProjectName: flyweight
 * @Package: com.test
 * @ClassName: Test
 * @Description:
 * @Author: Xiao Nong
 * @Version: 1.0
 */
public class Test {

    public static void main(String[] args) {
        Bicycle bicycle1 = new Bicycle("小明");
        bicycle1.rideBicycle();

        Bicycle bicycle2 = new Bicycle("小王");
        bicycle2.rideBicycle();

        Bicycle bicycle3 = new Bicycle("小李");
        bicycle3.rideBicycle();

    }
}
