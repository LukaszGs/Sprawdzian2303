package Zadanie3;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        LinkedList<Integer> m = new LinkedList<Integer>();
        Random rand = new Random();
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();

        while (num > 200) {
            System.out.println("podaj poprawna wartosc");
            num = scr.nextInt();
        }

        for (int i = 0; i <= num; i++) {
            m.add(rand.nextInt(200) - 100);
        }
        System.out.println(m);

        int pos = 0;
        int neg = 0;
        for (int i = 0; i < m.size(); i++) {
            if (m.get(i) > 0) {
                pos++;
            } else {
                neg++;
            }
        }

        Comparable max = Collections.max(m);
        Comparable min = Collections.min(m);
        System.out.println("min=" + min + ", max=" + max);
        System.out.println("pos:neg   " + pos + ":" + neg);
    }


}
