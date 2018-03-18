package Zadanie4.DaniePodstawowe;

import Zadanie4.Obiad;

public class mielony extends Obiad {
    @Override
    public String pobierzOpis() {
        return "mielony z kota";
    }

    @Override
    public double koszt() {
        return 6;
    }
}
