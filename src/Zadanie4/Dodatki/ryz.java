package Zadanie4.Dodatki;

import Zadanie4.Obiad;

public class ryz extends dodatki {
    Obiad obiad;

    public ryz(Obiad obiad) {
        this.obiad = obiad;
    }

    @Override
    public String pobierzOpis() {
        return obiad.pobierzOpis() + " z ryzem";
    }

    @Override
    public double koszt() {
        return obiad.koszt() + 2;
    }

}
