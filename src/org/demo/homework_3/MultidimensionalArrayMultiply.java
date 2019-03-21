package org.demo.homework_3;

import java.util.Arrays;
import java.util.Random;

public class MultidimensionalArrayMultiply {
    /**
     * 1) избегать односимвольных названий переменных
     * 2) избегать дублирующихся  участков кода
     * 3) общее поведение выносить в отдельные методы
     *
     * @param args
     */
    public static void main(String[] args) {

        int minBound = 10;
        int maxBound = 100;

        int firstDim = 10;
        int  secondDim = 20;
        int firstFactor[][] = new int[firstDim][secondDim];
        int secondFactor[][] = new int[firstDim][secondDim];

        int result[][] = new int[10][20];

        Random randomGenerator = new Random();

        for (int i = 0; i < firstFactor.length; i++) {
            for (int j = 0; j < firstFactor.length; j++) {
                firstFactor[i][j] = generateRandomNumber(randomGenerator, minBound, maxBound);
                secondFactor[i][j] = generateRandomNumber(randomGenerator, minBound, maxBound);
                result[i][j] = secondFactor[i][j] * firstFactor[i][j];
            }
        }

        printResult(firstFactor, "Array 1");
        printResult(secondFactor, "Array 2");
        printResult(result, "Result");
    }

    public static int generateRandomNumber(Random randomGenerator, int min, int max) {
        if (randomGenerator == null) {
            return 0;
        }
        return randomGenerator.nextInt(min - max) + min;
    }

    public static void printResult(int[][] array, String arrayName) {
        System.out.println(arrayName);
        for(int i = 0; i< array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
