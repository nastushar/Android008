package com.nastya;

public class Man implements Ranable, Jumping {
    private int manHeightPot ;
    private int manLengthPot ;
    private boolean disqualification ;
    public Man ( int manHeightPot , int manLengthPot ) {
        this.manHeightPot = manHeightPot;
        this.manLengthPot = manLengthPot;
    }

    @Override
    public void run (int l) {
        if (l > manLengthPot) {
            System.out.println ("Человек не смог добежать");
            disqualification = true;

        } else {
            System.out.println ("Человек добежал");
        }
    }

    @Override
    public void jump (int h) {
        if (disqualification==false) {
            if (h > manHeightPot) {
                System.out.println ("Человек не смог перепрыгнуть");
                disqualification = true;
            } else {
                System.out.println ("Человек перепрыгнул");
            }
        }
    }

    public int getManHeightPot () {
        return manHeightPot;
    }

    public int getManLengthPot () {
        return manLengthPot;
    }

    public void setManHeightPot ( int manHeightPot ) {
        this.manHeightPot = manHeightPot;
    }

    public void setManLengthPot ( int manLengthPot ) {
        this.manLengthPot = manLengthPot;
    }
}
