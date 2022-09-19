package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat14 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Adjon meg egy stringet");
        String szo=sc.nextLine();
        String valasz;
        do {
            System.out.printf("Válasszon az alábbiak közül: %na.)Nagybetűssé alakítás %nb.)Kisbetűssé alakítás %nc.)Hossza %nd.)Összehasonlít %ne.)Egy részt kíiratni(kezdő és vég karakter helye) %nf.)Kilépés%n");
            valasz= sc.nextLine();
            if (valasz.equals("a")){
                System.out.println(szo.toUpperCase());
            }
            else if (valasz.equals("b")){
                System.out.println(szo.toLowerCase());
            }
            else if (valasz.equals("c")){
                System.out.println(szo.length()+" hosszú a szöveg");
            }
            else if (valasz.equals("d")){
                System.out.println("Adjon meg egy másik stringet");
                String masik_szoveg=sc.nextLine();
                if (masik_szoveg.equals(szo)){
                    System.out.println("A két szöveg egyenlő");
                }
                else{
                    System.out.println("A két szó különböző");
                }
            }
            else if (valasz.equals("e")){
                System.out.println("Hanyadik karaktertől írassa ki?");
                int elso=sc.nextInt();
                System.out.println("Meddig?");
                int utolso=sc.nextInt();
                if (elso>utolso || utolso>szo.length()){
                    System.out.println("A kiíratás nem lehetséges");
                }
                else{
                    System.out.println(szo);
                }
            }
        }while(!valasz.equals("f"));
            System.out.println("A program kilép");
    }
}
