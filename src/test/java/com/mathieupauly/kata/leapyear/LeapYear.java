package com.mathieupauly.kata.leapyear;

public class LeapYear {

    boolean isLeap(int year) {
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        return year % 4 == 0;
    }
}