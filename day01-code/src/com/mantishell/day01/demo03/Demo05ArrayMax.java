package com.mantishell.day01.demo03;

public class Demo05ArrayMax {
    public static void main(String[] args) {
        int[] array = {10,2,30,45};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
