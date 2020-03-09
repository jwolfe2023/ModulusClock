package com.LickingHeights;

import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	modulusClock();



    }

    public static void modulusClock() {

        int hours;

        int minutes;

        Scanner keyboard;

        keyboard = new Scanner(System.in);

        System.out.println("Give Me An Hour: ");

        hours = keyboard.nextInt();

        System.out.println("Give Me A Amount of Minute(s): ");

        minutes = keyboard.nextInt();

        System.out.println(hours);

        System.out.println(minutes);

    }
}
