package com.juaracoding.Praktikum;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author LENOVO a.k.a. M Muchib Zainul Fikry
Java Developer
Created on 13/10/2025 21:38
@Last Modified 13/10/2025 21:38
Version 1.0
*/
import java.util.Scanner;

// Output dari input Tid4k $@ma adalah 786
// Catatan: Hasil ini diperoleh dari jumlah nilai ASCII setiap karakter dalam string.
// Contoh output di soal (529 dan 238) tidak sesuai dengan perhitungan ASCII, kemungkinan ada kekeliruan pada soal.

public class Praktikum1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Kata : ");
        String input = scanner.nextLine();

        int total = 0;
        for (int i = 0; i < input.length(); i++) {
            total += (int) input.charAt(i);
        }

        System.out.println("Hasil\t: " + total);
    }
}
