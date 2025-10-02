package com.juaracoding.probasic;

import java.util.ArrayList;
import java.util.List;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Muchib
Java Developer
Created on 01/10/2025 20:34
@Last Modified 01/10/2025 20:34
Version 1.0
*/

public class JavaCasting {

    public static void main(String[] args) {
        int intX = 2;
        long longB = 2147483648L;
        Integer integerB = 2;
        int [] intArr = new int [2];
        System.out.println(intArr[0]);
        System.out.println(intArr[1]);

        String strX = "Cumi";
        Coretan c = new Coretan();
        Coretan c1 = new Coretan();
        System.out.println(strX);
        System.out.println(c);
        System.out.println(c1);

        System.out.println("265344 detik?");// jadikan ini dengan format jam menit detik
//48 jam 30 menit 58 detik

        int totalDetik = 265344;

        int jam = totalDetik / 3600;
        int sisaDetik = totalDetik % 3600;
        int menit = sisaDetik / 60;
        int detik = sisaDetik % 60;

        System.out.println(jam + " jam " + menit + " menit " + detik + " detik");
//        int a = (int) b;
//        System.out.println(a);
    }


}
