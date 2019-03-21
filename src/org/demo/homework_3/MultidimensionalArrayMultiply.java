package org.demo.homework_3;

import java.util.Arrays;
import java.util.Random;

public class MultidimensionalArrayMultiply {

    public static void main(String[] args) {
        Random r = new Random();
        int minBound = 10;
        int maxBound = 100;

        int array1[][] = new int[10][20];
        int array2[][] = new int[10][20];
        int array3[][] = new int[10][20];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                array1[i][j] = r.nextInt(maxBound - minBound) + minBound;
                array2[i][j] = r.nextInt(maxBound - minBound) + minBound;
                array3[i][j] = array2[i][j] * array1[i][j];
            }
        }

        System.out.println("Array 1");
        for(int i = 0; i< array1.length; i++) {
            System.out.println(Arrays.toString(array1[i]));
        }

        System.out.println("Array 2");
        for(int i = 0; i< array2.length; i++) {
            System.out.println(Arrays.toString(array2[i]));
        }

        System.out.println("Array 3");
        for(int i = 0; i< array3.length; i++) {
            System.out.println(Arrays.toString(array3[i]));
        }
    }
}
