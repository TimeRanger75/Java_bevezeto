package hu.petrik.javabevezeto;

import java.util.Random;
import java.util.Scanner;

public class Feladat8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Fej vagy írás? (0 - Fej, 1 - Írás)");
        int tipp = sc.nextInt();
        int gepDobas = (int)(Math.random() * 2);
        /*
        Egész szám generálása 'a' és 'b' között:
        (int)(Math.random() * (max - min+1))+min
         */

        System.out.printf("Dobás eredménye: %s", (gepDobas == 0) ? "Fej" : "Írás");

        if (tipp == gepDobas){
            System.out.printf("Eltaláltad!");
        }
        else {
            System.out.printf("Nem találtad el!");
        }
    }
}
