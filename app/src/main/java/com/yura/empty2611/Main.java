package com.yura.empty2611;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Unit[] units = new Unit[5];
        for(int i = 0; i < units.length; i++) {
            int role = new Random().nextInt(4);
            switch (role) {
                case 0 :
                    units[i] = new Warrior("Warrior", 100);
                    break;
                case 1 :
                    units[i] = new Wizard("Wizard", 100, 50 + new Random().nextInt(50));
                    break;
                case 2 :
                    units[i] = new Robot("Robot", 100, 100);
                    break;
                case 3 :
                    units[i] = new Terminator("Terminator", 100, 100, "m-4");
                    break;
            }
        }
        for(Unit unit : units) {
            unit.printInfo();
            System.out.println();
        }

    }
}
