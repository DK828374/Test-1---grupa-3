package pl.edu.uwm.wmii.ewakot.laboratorium00;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe n: ");
        int n = in.nextInt();
        Random r = new Random();
        System.out.println("N = " + n);
        int[] tablica = new int[n];
        for (int i = 0; i < n; i++) {
            int k = r.nextInt(101) - 50;
            tablica[i] = k;
        }
        System.out.println("Tablica:");
        for (int i = 0; i < n; i++) {
            System.out.println("Tab[" + i + "] = " + tablica[i]);
        }

        int im = 0;

        int max = tablica[0];
        for (int i = 0; i < n; i++) {
            if (tablica[i] > max)
                max = tablica[i];
        }

        for (int j = 0; j < n; j++) {
            if (max == tablica[j]) im++;
        }

        System.out.println("Element największy to: " + max + ", które występuje " + im + " raz\\y");
    }
}
