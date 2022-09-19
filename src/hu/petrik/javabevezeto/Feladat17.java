package hu.petrik.javabevezeto;

import java.util.Arrays;

public class Feladat17 {
    public static void main(String[] args) {
        int[] tomb1={22,1,3,45,34,600};
        int[] tomb2={33,23,4,52,33,66};
        int[] tomb3=new int[6];
        for (int i = 0; i < tomb3.length; i++) {
            tomb3[i]=tomb1[i]+tomb2[i];
        }

        System.out.println(Arrays.toString(tomb1));
        System.out.println(Arrays.toString(tomb2));
        System.out.println(Arrays.toString(tomb3));
    }
}
