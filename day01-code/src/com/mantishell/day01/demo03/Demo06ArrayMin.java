package com.mantishell.day01.demo03;

public class Demo06ArrayMin {
    public static void main(String[] args) {
        int[] array = {10,2,30,45};
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] < min){
                min = array[i];
            }
        }
        System.out.println(min);
    }
}
