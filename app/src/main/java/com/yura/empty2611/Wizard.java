package com.yura.empty2611;

public class Wizard extends Unit{
    private int mana;
    public Wizard(String name, int health,
                  int mana) {
        super(name, health);
        this.mana = mana;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Mana:" + this.mana);
    }
}
