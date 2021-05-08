package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
        ex6();
    }

    //1
    public static void ex1(){
        int[] mas = {1,2,3,4,5};
        boolean flag = true;
        for(int i = 0; i < mas.length - 1; i++){
            if (mas[i] > mas[i + 1]) {
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("True!");
        }
        else {
            System.out.println("Please try again.");
        }
    }

    //2
    public static void ex2(){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину массива:");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Заполните массив:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.println("Ваш массив:" + Arrays.toString(array));
    }

    //3
    public static void ex3(){
        int [] mas = {5,6,7,2};
        System.out.println("Array 1:" + Arrays.toString(mas));
        int test = mas[0];
        mas[0] = mas[mas.length - 1];
        mas[mas.length - 1] = test;
        System.out.println("Array 2:" + Arrays.toString(mas));
    }

    //4
    public static void ex4(){
        int [] mas = {1,2,3,1,2,4};
        for(int i = 0; i < mas.length; i++){
            boolean flag = true;
            for (int j = 0; j < mas.length; j++){
                if(mas[i] == mas[j] && i != j){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println("Уникальное число: " + mas[i]);
            }
        }
    }

    //5
    public static void ex5(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите N-е число Фиббоначи:");
        int a = in.nextInt();
        int b = 0;
        int c = 1;
        for(int i = 2; i <= a; i++){
            int d = c + b;
            b = c;
            c = d;
        }
        System.out.println("Результат: " + c);
    }

    //6
    public static void ex6() {
        int[] mas = new int[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 100) + 1;
        }
        String str = Arrays.toString(mas);
        System.out.println("Случайный массив:" + str);
        var mas1 = sortMerge(mas);
        String str1 = Arrays.toString(mas1);
        System.out.println("Массив после сортировки:" + str1);
    }
    private static int[] sortMerge(int[] arr) {
        int len = arr.length;
        if (len < 2) return arr;
        int middle = len / 2;
        return merge(sortMerge(Arrays.copyOfRange(arr, 0, middle)),
                sortMerge(Arrays.copyOfRange(arr, middle, len)));
    }
    private static int[] merge(int[] arr_1, int[] arr_2) {
        int len_1 = arr_1.length, len_2 = arr_2.length;
        int a = 0, b = 0, len = len_1 + len_2; // a, b - счетчики в массивах
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            if (b < len_2 && a < len_1) {
                if (arr_1[a] > arr_2[b]) result[i] = arr_2[b++];
                else result[i] = arr_1[a++];
            } else if (b < len_2) {
                result[i] = arr_2[b++];
            } else {
                result[i] = arr_1[a++];
            }
        }
        return result;
    }
}