package com.nastya;

public class Cat implements Ranable, Jumping {
  private int catHeightPot ;
  private int catLengthPot ;
  private boolean disqualification ;
    public Cat ( int catHeightPot , int catLengthPot) {
        this.catHeightPot = catHeightPot;
        this.catLengthPot = catLengthPot;
    }
    @Override
    public void run (int l) {
        if (l > catLengthPot) {
            System.out.println ("Кошка не смогла добежать");
            disqualification = true;

        } else {
            System.out.println ("Кошка добежала");
        }
    }

    @Override
    public void jump (int h) {
        if (disqualification == false) {
            if (h > catHeightPot) {
                System.out.println ("Кошка не смогла перепрыгнуть");
                disqualification = true;
            } else {
                System.out.println ("Кошка перепрыгнула");
            }
        }

    }

    public int getCatHeightPot () {
        return catHeightPot;
    }

    public void setCatHeightPot ( int catHeightPot ) {
        this.catHeightPot = catHeightPot;
    }

    public int getCatLengthPot () {
        return catLengthPot;
    }

    public void setCatLengthPot ( int catLengthPot ) {
        this.catLengthPot = catLengthPot;
    }
}
