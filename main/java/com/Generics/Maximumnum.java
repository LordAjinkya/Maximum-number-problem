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

    //code to find maximum decimal no using float
    public Float findMaximumNumber(Float num1, Float num2, Float num3) {
        Float maxNumber = num1;
        if (maxNumber.compareTo(num2) < 0) {
            maxNumber = num2;
        }
        if (maxNumber.compareTo(num3) < 0) {
            maxNumber = num3;
        }
        return maxNumber;
    }

    public static void main(String[] args) {
        System.out.println("WElcome");
    }

}
