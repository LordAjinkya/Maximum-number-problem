package com.Generics;

public class MaximumNumber<T extends Comparable<T>> {
    private final T num1;
    private final T num2;
    private final T num3;
    private final T num4;
    private final T num5;

    public MaximumNumber(T num1, T num2, T num3,T num4,T num5) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
        this.num5=num5;
        
    }

    public T getCheckMaximum(){
        return MaximumNumber.checkMaximum(num1,num2,num3,num4,num5);
    }
    public static<T extends Comparable> T checkMaximum(T num1, T num2, T num3,T num4,T num5){
        T maxNum=num1;
        if (num2.compareTo(maxNum)>0){
            maxNum=num2;
        }
        if (num3.compareTo(maxNum)>0){
            maxNum=num3;
        }
        return maxNum;
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
