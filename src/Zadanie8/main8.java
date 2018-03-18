package Zadanie8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main8 {
    public static void main(String[] args) {
        File file = new File("moj stary to fanatyk wedkarstwa.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(new FileInputStream(file));
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
        int count = 0;
        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] arr = line.split(" ");
            for (int i = 0; i < arr.length; i++) {
                count++;
            }
        }
        System.out.println("Liczba slow: " + count);
    }
}

//no i cuś nie pykło

