package Zadanie4.Dodatki;

import Zadanie4.Obiad;

public class makaron extends dodatki {
    Obiad obiad;

    public makaron(Obiad obiad) {
        this.obiad = obiad;
    }

    @Override
    public String pobierzOpis() {
        return obiad.pobierzOpis() + " z makaronem";
    }

    @Override
    public double koszt() {
        return obiad.koszt() + 3;
    }
}
