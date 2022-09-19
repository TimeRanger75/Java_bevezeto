package hu.petrik.javabevezeto;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Feladat4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Adja meg a háromszög egyik oldalát: ");
        double a = sc.nextDouble();
        System.out.print("Adja meg a háromszög második oldalát: ");
        double b = sc.nextDouble();
        System.out.print("Adja meg a háromszög harmadik oldalát: ");
        double c = sc.nextDouble();
        if ((a + b > c) && (a + c > b) && (b + c > a) && (a > 0) && (b > 0) && (c > 0)) {
            double kerulet = a + b + c;
            System.out.printf("A háromszög kerülete: %f", kerulet);
        } else {
            System.out.println("Hibás adatok");
        }
    }
}
