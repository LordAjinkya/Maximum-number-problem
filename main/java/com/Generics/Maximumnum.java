package com.Generics;

public class Maximumnum {
    public int findMax(Integer num1, Integer num2, Integer num3) {
        Integer maxNum = num1;
        if (maxNum.compareTo(num2) < 0) {
            maxNum = num2;
        }
        if (maxNum.compareTo(num3) < 0) {
            maxNum = num3;
        }
        return maxNum;
    }

}
