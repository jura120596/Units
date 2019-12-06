package com.yura.empty2611;

public class Unit implements Comparable, Cloneable{
    private final String name;
    private int health;

    public Unit(String name, int health) {
        this.name = name;
        name = name.concat("sdksjd");
        this.health = health;
    }

    public void printInfo(){
        System.out.println("Name:" + name);
        System.out.println("Health:" + health);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}