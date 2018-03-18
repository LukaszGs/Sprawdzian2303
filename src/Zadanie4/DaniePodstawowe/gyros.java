package Zadanie4.DaniePodstawowe;

import Zadanie4.Obiad;

public class gyros extends Obiad {
    @Override
    public String pobierzOpis() {
        return "w sumie kebab";
    }

    @Override
    public double koszt() {
        return 12;
    }
}
