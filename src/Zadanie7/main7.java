package Zadanie7;

import java.util.Scanner;

public class main7 {
    public static void main(String[] args) {

        String stringOfChar;
        Scanner scr = new Scanner(System.in);
        stringOfChar = scr.nextLine();

        zadanie7 zad7 = new zadanie7();
        String z = zad7.rev(stringOfChar);
        System.out.println(z);

    }
}
