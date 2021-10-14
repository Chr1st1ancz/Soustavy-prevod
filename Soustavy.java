package com.company;

import java.util.Scanner;

public class Soustavy {
    public static void main(String[] args) {



        do {
            Scanner sc = new Scanner(System.in);

            System.out.println("1. Dec-Bin");
            System.out.println("2. Bin-Dec");
            System.out.println("3. Dec-Hex");
            System.out.println("4. Hex-Dec");
            System.out.println("5. End");
            int a = sc.nextInt();
            sc.nextLine();


            switch (a) {
                case 1:
                    System.out.println("napiš číslo");
                    int cislo = sc.nextInt();
                    sc.nextLine();
                    System.out.println(Integer.toBinaryString(cislo));
                    break;


                case 2:
                    System.out.println("napiš číslo");
                    int cislo2 = sc.nextInt();
                    sc.nextLine();
                    System.out.println(Integer.parseInt(String.valueOf(cislo2), 2));
                    break;

                case 3:
                    System.out.println("napiš číslo");
                    String cislo3 = sc.next();
                    sc.nextLine();
                    System.out.println(Integer.toHexString(Integer.parseInt(cislo3)));
                    break;
                case 4:
                    System.out.println("napiš číslo");
                    String hex = sc.next();
                    int decimal = Integer.parseInt(hex, 16);
                    System.out.println(decimal);
                    break;
                case 5:
                   return;
            }

        }while (1<2);

    }
}
