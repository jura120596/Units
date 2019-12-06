package com.yura.empty2611;

public class Warrior extends Unit{
    public Warrior(String name, int health) {
        super(name, health);
    }
    public void attack() {
        System.out.println("Я атакую");
    }
}
