package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
    }

    //1
    public static void ex1() {
        String str_1 = "Первая длинная строка.";
        String str_2 = "Вторая строка длиннее длинной первой строки.";
        if (str_1.length() > str_2.length()){
            System.out.println("Самая длинная строка: " + str_1);
        }
        else {
            System.out.println("Самая длинная строка: " + str_2);
        }
    }

    //2
    public static void ex2(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String word = scan.nextLine();
        if(word.equalsIgnoreCase(new StringBuilder(word).reverse().toString())){
            System.out.println(word + " - это слово палиндром.");
        }
        else {
            System.out.println(word + " - это слово не палиндром.");
        }
    }

    //3
    public static void ex3(){
        String str_1 = "Говорить бяка плохо.";
        String str_2 = str_1.replace("бяка", "[вырезано цензурой]");
        System.out.println("Было: " + str_1);
        System.out.println("Стало: " + str_2);
    }

    //4
    public static void ex4(){
        String str_1 = "Первая строка.";
        String str_2 = "Вторая строка.";
        int i = str_1.split(str_2).length;
        System.out.println("Количество вхождений: " + i);
    }

    //5
    public static void ex5(){
        String str_1 = "This is test string";
        System.out.println("Нормальная строка: " + str_1);
        String revStr = new StringBuilder(String.valueOf(str_1)).reverse().toString();
        System.out.println("Реверсивная строка: " + revStr);
    }
}
