package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        modulusClock();

    }

    public static void modulusClock() {

        Scanner keyboard;

        keyboard = new Scanner(System.in);

        int minutes;

        int hours;

        System.out.println("Give Me A Amount of Hour(s): ");

        hours = keyboard.nextInt();

        System.out.println("Give Me A Amount of Minute(s): ");

        minutes = keyboard.nextInt();

        hours = minutes >= 60 ? hours + minutes / 60 : hours ;

        hours = hours%12;

        minutes = minutes%60 ;

        hours = hours ==0 ? 12 : hours;

        System.out.printf("The Time is: %d:%02d",hours,minutes );
    }
}
