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

        minutes = hours >= 12 ? ++hours : minutes ;

        System.out.println("The Time Is: " + hours + ":" + minutes);

    }
}
