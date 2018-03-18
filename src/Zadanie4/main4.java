package Zadanie4;

import Zadanie4.DaniePodstawowe.gyros;
import Zadanie4.DaniePodstawowe.schabowy;
import Zadanie4.Dodatki.frytki;
import Zadanie4.Dodatki.ziemniaki;

public class main4 {
    public static void main(String[] args) {
        Obiad schabowy = new schabowy();
        Obiad schabowyZZiemniakami = new ziemniaki(schabowy);

        System.out.println(schabowyZZiemniakami.pobierzOpis());
        System.out.println(schabowyZZiemniakami.koszt());

        Obiad gyros = new gyros();
        Obiad gyrosZFrytkami = new frytki(gyros);

        System.out.println(gyrosZFrytkami.pobierzOpis());
        System.out.println(gyrosZFrytkami.koszt());
    }
}
