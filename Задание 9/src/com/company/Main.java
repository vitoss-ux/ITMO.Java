package com.company;

import java.util.Arrays;
import java.lang.Math;


public class Main {

    public static void main(String[] args) {

        ex1();
        ex2(new int[][] {{1, 34, 22}, {2, 65, 99},{34,87,76}});
        ex3();
        ex4(5,5);
    }

    public static void ex1() {

        try {
            int[][] array = {{1, 34, 22}, {2, 65, 99}};
            System.out.println("Двумерный массив: ");
            System.out.println(Arrays.deepToString(array));

            int max = 0;
            for (int[] ints : array) {
                for (int anInt : ints) {
                    if (max < anInt) {
                        max = anInt;
                    }
                }
            }
            System.out.println("Максимальный элемент двумерного массива: " + max);
        } catch (IllegalArgumentException e){
            System.out.println("Пустой массив.");
        }
    }

    public static void ex2(int[][] numbers){
        boolean b = true;
        try{
            for(int[] i : numbers){
                if (i.length != numbers.length){
                    b = false;
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (b){
            System.out.println("Заданный массив квадратный.");
        }
        else {
            System.out.println("Заданный массив НЕ квадратный.");
        }
    }

    public static void ex3(){
        int[][] array = {{1, 34, 22}, {2, 65, 99},{1, 34, 22}, {2, 65, 99},{34,87,76}};
        int sum = 0; //сумма строки счетчик
        int maxSum = Integer.MIN_VALUE; //макс сумма строки
        int index = Integer.MIN_VALUE; //индекс maxSum
        try{
            for(int i = 0; i < array.length; i++){
                for (int j = 0; j < array[i].length; j++){
                    sum += array[i][j];
                }
                if (maxSum < sum){
                    maxSum = sum;
                    index = i;
                }
                sum = 0;
            }
        } catch (Exception e){
            System.out.println("Error.");
        }
        System.out.println("Ряд: " + index + " " + "имеет наибольшую сумму: " + maxSum);
    }

    public static void ex4(int M, int N){
        char[][] chars = new char[M][N];
        try{
            for(int i = 0; i < chars.length; i++){
                for(int j = 0; j < chars[i].length; j++){
                    int rnd = (int)(65 + Math.random() * 26);
                    chars[i][j] = (char)(rnd);
                    System.out.print(chars[i][j] + " ");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
