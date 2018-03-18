package Zadanie4.DaniePodstawowe;

import Zadanie4.Obiad;

public class schabowy extends Obiad {
    @Override
    public String pobierzOpis() {
        return "schaboszczak";
    }

    @Override
    public double koszt() {
        return 10;
    }
}
