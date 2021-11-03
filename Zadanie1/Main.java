package pl.edu.uwm.wmii.ewakot.laboratorium00;
import java.util.Scanner;
public class Main {

    public static int showPrimes(int[] list) {

        int[] odp = new int[list.length];
        for (int i = 1; i < list.length; i++) {
            int x = 0;
            int a = list[i];
            for (int j = 1; j < list.length; j++) {
                if (a % j == 0) x += 1;
                if (a % j != 0) x += 0;
            }
            if (x == 0) odp[i] = x;

        }
        for (int i = 0; i < odp.length; i++) {
            if (odp[i] != 0) System.out.println(odp[i]);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            System.out.println("Podaj liczbe n: ");
            int n = in.nextInt();

            int[] list = new int[n];

        for (int i=0; i < n; i++){
            System.out.println("podaj a" + (i+1) + ": ");
            int k = in.nextInt();
            list[i] = k;
        }
        //zadanie1
        System.out.println(showPrimes(list));


    }
}
