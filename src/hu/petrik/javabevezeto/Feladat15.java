package hu.petrik.javabevezeto;

import java.util.*;
import java.math.*;
public class Feladat15 {
    public static void main(String[] args) {
        int[] szamok=new int[25];
        for (int i=0; i<szamok.length;i++){
            szamok[i]=i+1;
            if (i%2!=0) {
                System.out.println(Math.pow(szamok[i], 2));
            }
        }
    }
}
