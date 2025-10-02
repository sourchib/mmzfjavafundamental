package com.juaracoding.operator;

public class OperatorExample {

    /*
        cara komentar
        bintang
    */
    private int intM = 12;

    /**
     ini adalah fungsi main di class OperatorExample
     */
    public static void main(String[] args) {
        int x = 2;
        int num1 = 10 * ++x;//ekspektasi = 30
        System.out.println(num1);

        double douX = 75.0/8;
        int intZ = (int) (75.0/8);
        System.out.println(douX);
        System.out.println(intZ);
        System.out.println((4+3%2));

        int intJ = 12;
//        intJ = intJ + 6;
        intJ *= 6;
//        komentar --> CTRL + /
//        cara komentar
//                di Java
        /*
            cara komentar
            bintang
        */
        System.out.println(intJ);
//        System.out.println(!((6<=5) ^ (5!=2)));
        System.out.println((4<=5) ^ (5!=2));
//        System.out.println(!(3!=4));
        System.out.println(Integer.toBinaryString(75));//A
        System.out.println(10 & 12);
        System.out.println((int)'-');
    }

    public void coba(String x, String y , int z){
    }

}


/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author LENOVO a.k.a. M Muchib Zainul Fikry
Java Developer
Created on 02/10/2025 19:25
@Last Modified 02/10/2025 19:25
Version 1.0
*/
