package com.yura.empty2611;

class Terminator extends Robot{
    private String gun;
    public Terminator(String name, int health, int armor, String gun) {
        super(name, health, armor);
        this.gun = gun;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Gun:" + gun);
    }
}
