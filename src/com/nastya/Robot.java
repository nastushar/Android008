package com.nastya;

public class Robot implements Ranable, Jumping {
    private int robotHeightPot ;
    private int robotLengthPot ;
    private boolean disqualification ;

    public Robot ( int robotHeightPot , int robotLengthPot ) {
        this.robotHeightPot = robotHeightPot;
        this.robotLengthPot = robotLengthPot;
    }

    @Override
    public void run (int l) {
        if (l > robotLengthPot) {
            System.out.println ("Робот не смог добежать");
            disqualification = true;

        } else {
            System.out.println ("Робот добежал");
        }
    }

    @Override
    public void jump (int h) {
        if (disqualification ==false) {
            if (h > robotHeightPot) {
                System.out.println ("Робот не смог перепрыгнуть");
                disqualification = true;
            } else {
                System.out.println ("Робот перепрыгнул");
            }
        }
    }
    public int getRobotHeightPot () {
        return robotHeightPot;
    }

    public void setRobotHeightPot ( int robotHeightPot ) {
        this.robotHeightPot = robotHeightPot;
    }

    public int getRobotLengthPot () {
        return robotLengthPot;
    }

    public void setRobotLengthPot ( int robotLengthPot ) {
        this.robotLengthPot = robotLengthPot;
    }
}
