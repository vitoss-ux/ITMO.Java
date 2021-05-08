package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.function.BiFunction;

public class Main {

    public static void main(String[] args) throws IOException {
        ex1("src/Files/Test_1.txt");
        ex2();
        ex3();
        ex4();
        ex5();
    }

    public static void ex1(String fileName) throws IOException {
        String str;
        List<String>list;
        String[] res;

        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        while ((str = bufferedReader.readLine()) != null) {
            str = str.replaceAll("[()?:!.,;{}]", " ").replaceAll("[1-9]", " ");
            res = str.split(" ");

            for (int i = 0; i < res.length; i++)
                res[0] = res[i];

            Map<String, Integer> wordCount = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
            list = Arrays.asList(res);
            Collections.sort(list);

            for (String word : (list)) {
                if (wordCount.containsKey(word) && word.length() > 1) {
                    wordCount.put(word, wordCount.get(word) + 1);
                } else {
                    wordCount.put(word,1);
                }
            }

            for (Map.Entry<String, Integer> word1 : wordCount.entrySet())
                if (word1.getValue() > 1) {
                    System.out.printf("Слово: %s; Количество: %d \n", word1.getKey().toLowerCase(Locale.ROOT), word1.getValue());
                }
        }
    }

    public static void ex2(){
        Set<Integer> collection = new HashSet<>();
        collection.add(7);
        collection.add(2);
        collection.add(1);
        collection.add(3);
        collection.add(7);
        List out = new ArrayList();
        out.addAll(collection);
        System.out.println(collection);
    }

    public static void ex3(){
        ArrayList<Double> arrayList = new ArrayList<>();
        LinkedList<Double> linkedList = new LinkedList<>();

        final int N = 1000000;
        final int M = 1000;

        for (int i = 0; i < N; i++) {
            arrayList.add(Math.random());
            linkedList.add(Math.random());
        }

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < M; i++) {
            arrayList.get((int) (Math.random() * (N - 1)));
        }
        System.out.println(System.currentTimeMillis() - startTime);

        startTime = System.currentTimeMillis();

        for (int i = 0; i < M; i++) {
            linkedList.get((int) (Math.random() * (N - 1)));
        }
        System.out.println(System.currentTimeMillis() - startTime);
    }

    public static void ex4(){
        int min = 1;
        int max = 100;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String userName= in.nextLine();
        User user =new User(userName);

        Map<User,Integer> gamer = new HashMap<>();
        gamer.put(new User("James"),1);
        gamer.put(new User("Todd"),2);
        gamer.put(new User("Lloyd"),3);
        gamer.put(new User("Harold"),4);
        gamer.put(new User("Duke"),5);

        int points = User.randomPoints(min,max);

        for(User key : gamer.keySet()){
            if(key.getName().equals(userName)){
                System.out.println("Игрок: " + user.getName() + "Очки: " + points);
            } else {
                System.out.println("Игрок не найден.");
            }
        }
    }

    public static void ex5(){
        Array inter = new Array();
        String[] array = new String[]{"One", "Two", "Three", "Four", "Five"};
        System.out.println(inter.arrayToMap(array));
    }
}