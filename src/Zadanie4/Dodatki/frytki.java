package Zadanie4.Dodatki;

import Zadanie4.Obiad;

public class frytki extends dodatki {
    Obiad obiad;

    public frytki(Obiad obiad) {
        this.obiad = obiad;
    }

    @Override
    public String pobierzOpis() {
        return obiad.pobierzOpis() + " z frytkami";
    }

    @Override
    public double koszt() {
        return obiad.koszt() + 5;
    }
}
