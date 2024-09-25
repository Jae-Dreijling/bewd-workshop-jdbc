package com.example.bewd_workshop_jbc;

public class Snack {
    public int snacknr;
    public String snacknaam;
    public int calorieen;

    // Uiteraard is het handig om een toString-methode te implementeren.

    @Override
    public String toString() {
        return "Snack{" +
                "snacknr=" + snacknr +
                ", snacknaam='" + snacknaam + '\'' +
                ", calorieen=" + calorieen +
                '}';
    }
}
