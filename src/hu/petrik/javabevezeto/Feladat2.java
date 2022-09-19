package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Adja meg a terület szélességét: ");
        double szelesseg = sc.nextFloat();

        System.out.println("Adja meg a terület magasságát: ");
        double magassag = sc.nextFloat();

        double terulet = 1.1*(magassag*szelesseg);
        double csempeterulet = Math.pow(2, 2);
        long db = Math.round(Math.ceil(terulet/csempeterulet));

        System.out.println("Összesen " + db + " db csempére lesz szükség.");




    }
}
