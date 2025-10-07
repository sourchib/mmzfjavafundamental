/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author LENOVO a.k.a. M Muchib Zainul Fikry
Java Developer
Created on 06/10/2025 22:50
@Last Modified 06/10/2025 22:50
Version 1.0
*/

package com.juaracoding.mmzf_ujian_minggu_1;

public class Soal5 {
    public static void main(String[] args) {
        int[] hargaTiket = {50000, 60000, 70000, 80000, 90000};
        int total = 0;

        for (int i = 0; i < hargaTiket.length; i++) {
            System.out.println("Harga tiket film " + (i + 1) + ": " + hargaTiket[i]);
            total += hargaTiket[i];
        }

        System.out.println("Total harga tiket: " + total);
    }
}

