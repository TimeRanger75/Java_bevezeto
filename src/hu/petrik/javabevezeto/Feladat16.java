package hu.petrik.javabevezeto;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Feladat16 {
    public static void main(String[] args) {
        int[] szamok=new int[5];
        Scanner sc=new Scanner(System.in);
        for (int i=0; i<szamok.length;i++){
            System.out.println("Adjon meg egy számot: ");
            int szam=sc.nextInt();
            szamok[i]=szam;
        }
        System.out.println(Arrays.toString(szamok));

        for(int i=szamok.length-1;i>=0;i--)
            System.out.printf(szamok[i] + "  ");

        System.out.println("%nMinden második szám: ");
        for(int i=0;i<szamok.length;i=i+2)
            System.out.printf(szamok[i] + "  ");

        System.out.println("Adjon meg egy sorszámot");
        int sorszam=sc.nextInt();
        System.out.println(szamok[sorszam-1]);
    }
}
