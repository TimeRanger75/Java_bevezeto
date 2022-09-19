package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int osszeg = 0;
        int paros = 0;
        int paratlan = 0;
        while(osszeg <= 100){
            System.out.println("Írjon be egy számot!");
            int szam = sc.nextInt();
            if (szam%2 == 0){
                paros++;
            }
            else {
                paratlan++;
            }
            osszeg += szam;
        }
        System.out.printf("A megadott számok közül %d volt páros és %d volt páratlan.", paros, paratlan);
    }
}
