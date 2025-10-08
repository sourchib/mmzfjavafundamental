package com.juaracoding.oop;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author LENOVO a.k.a. M Muchib Zainul Fikry
Java Developer
Created on 08/10/2025 19:37
@Last Modified 08/10/2025 19:37
Version 1.0
*/

import com.juaracoding.method.contohstatic.FungsiTwo;

public class PassingBy {
    public static void main(String[] args) {
        int x = 10 ;
        passingvalue(x);
        System.out.println("Nilai x saat ini adalah "+x);

//        Siswa s = new Siswa();
//        s.setUmur(10);
//        Siswa s1 = s;
//        System.out.println(s1.getUmur());
    }

    public static void passingvalue(int b){
        b = b+2;
    }
}

