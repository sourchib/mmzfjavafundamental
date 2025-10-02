package com.juaracoding.probasic;


public class KonversiWaktu {

    public static void main(String[] args) {
        // Input: 265344 detik
        int totalDetik = 265344;

        final int DETIK_PER_MENIT = 60;
        final int DETIK_PER_JAM = 3600;

        int jam = totalDetik / DETIK_PER_JAM;
        int sisaDetikSetelahJam = totalDetik % DETIK_PER_JAM;
        int menit = sisaDetikSetelahJam / DETIK_PER_MENIT;
        int detik = sisaDetikSetelahJam % DETIK_PER_MENIT;

        String hasilKonversi = String.format("%02d:%02d:%02d", jam, menit, detik);
        // Tampilkan hasil
        System.out.println("=== KONVERSI WAKTU ===");
        System.out.println("Total detik: " + totalDetik);
        System.out.println("Hasil konversi: " + hasilKonversi);
    }
}


/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author LENOVO a.k.a. M Muchib Zainul Fikry
Java Developer
Created on 02/10/2025 21:09
@Last Modified 02/10/2025 21:09
Version 1.0
*/
