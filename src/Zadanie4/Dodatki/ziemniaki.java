package Zadanie4.Dodatki;

import Zadanie4.Obiad;

public class ziemniaki extends dodatki {
    Obiad obiad;

    public ziemniaki(Obiad obiad) {
        this.obiad = obiad;
    }

    @Override
    public String pobierzOpis() {
        return obiad.pobierzOpis() + " z ziemniakami";
    }

    @Override
    public double koszt() {
        return obiad.koszt() + 3;
    }
}
