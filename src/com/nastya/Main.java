package com.nastya;

import java.util.Arrays;

public class Main {

    public static void main ( String[] args ) {
        Ranable[] competitor = GenerateRanable.getRanable ();
        Dimension[] obstacle = GenerateObstacle.getObstacle ();


        for (int i = 0; i < competitor.length; i++) {

                Arrays.toString (obstacle);
                competitor[ i ].run (1000);
                competitor[ i ].jump (2);

        }
    }
}
