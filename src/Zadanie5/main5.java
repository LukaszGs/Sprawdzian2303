package Zadanie5;

public class main5 {
    public static void main(String[] args) {
        zadanie5 zad5 = new zadanie5();
        int[][] tablica = new int[5][5];
        int tablica1 [] = {1, 2, 3};


        for(int i=0; i< tablica.length; i++){
            for(int j=0; j<tablica[i].length; j++)
                System.out.print(tablica[i][j]);
            System.out.println();
        }
    }
}
