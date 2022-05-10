import java.util.Arrays;
import java.util.Random;

public class Main {

    public static int nieParzyste(int[] tab) {
        int licznik = 0;
        for(int i=0; i<tab.length; i++) {
            if(tab[i] % 2 == 0) {
                tab[i]++;
                licznik++;
            }
        }
        return licznik;
    }



    public static int[] generujTablice(int n, int min, int max){
        int[] tab = new int[n];
        Random rand = new Random(System.currentTimeMillis());
        for(int i = 0; i < n; i++) {
            tab[i] = rand.nextInt(max - min + 1) - min;
        }
        return tab;
    }

    public static void main(String[] args) {
        //zad1 + inne
        int[] tab = generujTablice(10, 0, 10);
        System.out.println(Arrays.toString(tab));
        int liczbaZmienionych = nieParzyste(tab);
        System.out.println(Arrays.toString(tab));
        System.out.println("Liczba zmienionych elementow: " + liczbaZmienionych);


        //publikacje

        Publication[] tabPub = new Publication[3];
        tabPub[0] = new Publication("pan tadeusz", "hmmy001", 45.5, 10);
        tabPub[1] = new Publication("dziady", "hmmy002", 34.7, 12);
        tabPub[2] = new Publication("sss", "hmmy003", 23, 100);
        ArrayOfPublicationsMethods.showPublications(tabPub);
        System.out.println("Calkowity dochod: " + ArrayOfPublicationsMethods.calculateTotalIncome(tabPub));
    }
}