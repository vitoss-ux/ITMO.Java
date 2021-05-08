package com.company;

import java.util.HashMap;
import java.util.Map;

public class User {
    private String name;

    public User(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void gamerPrint(User user,int points){
        System.out.println("Игрок: " + user.getName() + " " + "Очки: " + points);
    }

    public static int randomPoints(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
