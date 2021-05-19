package com.Generics;

public class MaximumNumber {
    public int findMaximumNumber(int num1, int num2, int num3) {
        Integer maxNumber = num1;
        if (maxNumber.compareTo(num2) < 0) {
            maxNumber = num2;
        }
        if (maxNumber.compareTo(num3) < 0) {
            maxNumber = num3;
        }
        return maxNumber;
    }

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
    //code to find the max from the 3 strings
    public String findMaximumString(String firstString, String secondString, String thirdString) {
        String maximumValue = firstString;
        if (secondString.compareTo(maximumValue)>0) {
            maximumValue = secondString;
        }
        if(thirdString.compareTo(maximumValue)>0) {
            maximumValue=thirdString;
        }
        return maximumValue;
    }

    public static void main(String[] args) {
        System.out.println("WElcome");
    }

}
