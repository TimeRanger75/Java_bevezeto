package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Adja meg a téglalap egyik oldalát: ");
        double a = sc.nextDouble();
        sc.nextLine();
        System.out.print("Adja meg a téglalap másik oldalát: ");
        double b = Double.parseDouble(sc.nextLine().replace(',', '.'));
        System.out.print("Adja meg egy karaktert: ");
        String muvelet = sc.next();


        if (muvelet.equals("K") || muvelet.equals("k")) {
            double kerulet = 2*(a+b);
            System.out.printf("A téglalap kerülete: %f", kerulet);
        }
        else if (muvelet.equals("t") || muvelet.equals("T")) {
            double terulet = a * b;
            System.out.printf("A téglalap területe: %f", terulet);
        }
        else {
            System.out.println("Hibás adat");
        }

        if (a==b){
            System.out.println("Ez egy négyzet!");
        }

    }
}
