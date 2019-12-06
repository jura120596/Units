package com.yura.empty2611;

public class Robot extends Unit{
    private int armor;
    public Robot(String name, int health,
                 int armor) {
        super(name, health);
        this.armor = armor;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Armor:" + this.armor);
    }
}
