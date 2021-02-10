package com.nastya;

public class GenerateObstacle implements Dimension {


    public static Dimension[] getObstacle(){
        Dimension runWay = new RunWay ();
        Dimension wall = new Wall ();
        return new Dimension[]{runWay , wall};
    }

    @Override
    public void quantity ( int h ) {

    }
}
