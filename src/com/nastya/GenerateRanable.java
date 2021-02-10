package com.nastya;

public class GenerateRanable {

    public static Ranable[] getRanable(){
        Ranable cat = new Cat(3 , 100);
        Ranable man = new Man(2 , 1000);
        Ranable robot = new Robot(1 , 100000);
        return new Ranable[]{cat, man, robot};
    }

}
