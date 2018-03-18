package Zadanie5;

public class zadanie5 {
    void mirror(int[][] tab) {
        for (int i = 0; i < tab.length / 2; i++) {
            int[] temp = tab[i];
            tab[i] = tab[tab.length - i - 1];
            tab[tab.length - i - 1] = temp;
        }
        for (int j = 0; j < tab.length / 2; j++) {
            int[] temp1 = tab[j];
            tab[j] = tab[tab.length - j - 1];
            tab[tab.length - j - 1] = temp1;
        }

    }
}
