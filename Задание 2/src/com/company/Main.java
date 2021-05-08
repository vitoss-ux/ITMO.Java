package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
        ex6();
    }

    //1
    public static void ex1() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    //2
    public static void ex2() {
        int dev3=0;
        int dev5=0;
        int dev35=0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                dev3++;
            }
            if (i % 5 == 0) {
                dev5++;
            }
            if (i % 3 == 0 && i % 5 == 0) {
                dev35++;
            }
        }
        int[] array1 = new int[dev3];
        int[] array2 = new int[dev5];
        int[] array3 = new int[dev35];
        int count3=0;
        int count5=0;
        int count35=0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                array1[count3] = i;
                count3++;
            }
            if (i % 5 == 0) {
                array2[count5] = i;
                count5++;
            }
            if (i % 3 == 0 && i % 5 == 0) {
                array3[count35] = i;
                count35++;
            }
        }
        System.out.println("Делятся на 3: " + Arrays.toString(array1));
        System.out.println("Делятся на 5: " + Arrays.toString(array2));
        System.out.println("Делятся на 3 и 5: " + Arrays.toString(array3));
    }

    //3
    public static void ex3(){
        System.out.println("Введите три целых числа:");
        Scanner in = new Scanner(System.in);
        System.out.println("Первое число: ");
        int num1 = in.nextInt();
        System.out.println("Второе число: ");
        int num2 = in.nextInt();
        System.out.println("Третье число: ");
        int num3 = in.nextInt();

        int sum = num1 + num2;
        if(sum == num3){
            System.out.println("true");
        }
        else
            System.out.println("false");
    }

    //4
    public static void ex4(){
        System.out.println("Введите три целых числа:");
        Scanner in = new Scanner(System.in);
        System.out.println("Первое число: ");
        int num1 = in.nextInt();
        System.out.println("Второе число: ");
        int num2 = in.nextInt();
        System.out.println("Третье число: ");
        int num3 = in.nextInt();

        if(num2 > num1 && num3 > num2){
            System.out.print("true");
        }
        else
            System.out.print("false");
    }

    //5
    public static void ex5(){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину массива:");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Заполните массив:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.print ("Введенные элементы:");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + array[i]);
        }
        System.out.println();

        if(array[0] == 3 || array[array.length-1] == 3){
            System.out.println("true");
        }
        else
            System.out.println("false");
    }

    //6
    public static void ex6(){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину массива:");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Заполните массив:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.print ("Введенные элементы:");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + array[i]);
        }
        System.out.println();

        if(IntStream.of(array).anyMatch(x->x == 1 || x == 3)){
            System.out.println("Массив содержит 1 или 3");
        }
        else
            System.out.println("Массив НЕ содержит 1 или 3");
    }
}