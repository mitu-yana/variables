package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array = {11, 17, 28, 4, 9};
        int x = array[0];
        array[0] = array[array.length-1];
        array[array.length-1] = x;
        for (int i = 0; i < 5; i++){
                System.out.print(" " + array[i] + " ");
            }
        System.out.println(" ");
        int y = array[0]+array[(array.length-1)/2];
               System.out.println(y);
    }
}
