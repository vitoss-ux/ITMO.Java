package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Задание 1
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java.");

        //Задание 2
        int a = (46 + 10) * (10 / 3);
        int b = 29 * 4 * (-15);
        System.out.println(a);
        System.out.println(b);

        //Задание 3
        int num = 10500;
        int result = (num / 10) / 10;
        System.out.println(result);

        //Задание 4
        double d = 3.6;
        double j = 4.1;
        double i = 5.9;
        double res = d * j * i;
        System.out.println(res);

        //Задание 5
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        int num1 = in.nextInt();
        System.out.println("Input second number: ");
        int num2 = in.nextInt();
        System.out.println("Input third number: ");
        int num3 = in.nextInt();
        System.out.println("Your numbers is: ");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        //Задание 6
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        int bb = input.nextInt();
        if (bb % 2 != 0) {
            System.out.println("Нечетное");
        }
        else if(bb % 2 == 0 && bb > 100){
            System.out.println("Четное, выход за диапазон.");
        }
        else
            System.out.println("Четное");
    }
}
