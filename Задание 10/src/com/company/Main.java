package com.company;

import java.io.*;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
        ex6();
    }

    public static void ex1() {
        String fileName = "src/Files/file_1.txt";
        File file = new File(fileName);
        try(Scanner in = new Scanner(file)){
                while (in.hasNext()){
                    System.out.println(in.nextLine());
                }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }

    public static void ex2(){
        String fileName = "src/Files/file_2.txt";
        String str = "This is new string";
        try(FileWriter writer = new FileWriter(fileName,false)){
            writer.write(str);
            System.out.println("Success!");
        }catch (IOException e){
            System.out.println("Ups, something went wrong...");
        }
    }

    public static void ex3(){
        File file_1 = new File("src/Files/file_1.txt");
        File file_2 = new File("src/Files/file_2.txt");
        File file_3 = new File("src/Files/file_3.txt");
        StringBuilder out = new StringBuilder();
        try(Scanner in_1 = new Scanner(file_1);
            Scanner in_2 = new Scanner(file_2)){
                while (in_1.hasNext()){
                    out.append(in_1.nextLine()).append("\n");
                }
                while (in_2.hasNext()){
                    out.append(in_2.nextLine()).append("\n");
                }
                try(FileWriter writer = new FileWriter(file_3,false)) {
                    writer.write(out.toString());
                    System.out.println("Success!");
                }catch (IOException e){
                    System.out.println("Ups, something went wrong...");
                }
        } catch (IOException e){
            System.out.println("Files not found.");
        }
    }

    public static void ex4(){
        File src = new File("src/Files/file_3.txt");
        File cop = new File("src/Files/file_3_copy.txt");
        try{
            FileChannel from = new FileInputStream(src).getChannel();
            FileChannel to = new FileInputStream(cop).getChannel();
            to.transferFrom(from,0,from.size());
        }catch (IOException e){
            System.out.println("Ups, something went wrong...");
        }
    }

    public static void ex5(){
        String dir = "src/Files";
        String find = "file_2.txt";
        File f = new File(dir);
        String[] search = f.list();
        assert search != null;
        for (String file : search){
            if(find.equals(file)){
                System.out.println("File found: " + file + " " + "path: " + dir);
            }
        }
    }

    public static void ex6(){
        String dir = "src/Files";
        String txtFind = "Simple text";
        File f = new File(dir);
        File[] list = f.listFiles();
        assert list != null;
        for (File file : list){
            try(Scanner in = new Scanner(new File(String.valueOf(file)))){
                List<String> lines = new ArrayList<>();
                while (in.hasNextLine()){
                    lines.add(in.nextLine());
                }
                for (String s : lines){
                    if (s.equals(txtFind)){
                        System.out.println("String: " + txtFind + "find in file" + file);
                    }
                }
            } catch (IOException e){
                System.out.println("Ups, something went wrong...");
            }
        }
    }
}
