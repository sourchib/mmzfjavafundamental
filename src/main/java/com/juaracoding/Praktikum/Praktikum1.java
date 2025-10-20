package com.juaracoding.Praktikum;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author LENOVO a.k.a. M Muchib Zainul Fikry
Java Developer
Created on 13/10/2025 21:38
@Last Modified [Current Date] [Current Time] // Updated modification time
Version 1.0
*/

import java.util.Scanner;

/*
Ouput dari input Tid4k $@ma adalah 268
*/

public class Praktikum1 { // Deklarasi kelas Praktikum1 [cite: 4]
    public static void main(String[] args) { // Metode utama (main method) [cite: 4]
        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner untuk input pengguna [cite: 4]
        System.out.print("Masukkan Kata : "); // Mencetak permintaan untuk input [cite: 5]
        String input = scanner.nextLine(); // Membaca satu baris input dari pengguna [cite: 5]
        int total = 0; // Variabel untuk menyimpan total penjumlahan nilai ASCII
        // Mengubah String input menjadi array karakter
        char[] arrWord = input.toCharArray();
        // Menggunakan enhanced for loop (for-each) untuk iterasi dan penjumlahan
        for (char c : arrWord) {
            // Memeriksa apakah karakter termasuk:
            // 1. Huruf besar ('A' sampai 'Z')
            // 2. Angka ('0' sampai '9')
            // 3. Karakter antara ' ' (spasi) sampai '@'
            if ((c >= 'A' && c <= 'Z') ||
                    (c >= '0' && c <= '9') ||
                    (c >= ' ' && c <= '@')) {
                total += c; // Menambahkan nilai ASCII (integer) dari karakter ke total
            }
        }
        System.out.println("Hasil\t: " + total); // Mencetak hasil total penjumlahan [cite: 7]
    }
}