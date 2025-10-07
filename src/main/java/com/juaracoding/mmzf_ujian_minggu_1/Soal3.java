/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author LENOVO a.k.a. M Muchib Zainul Fikry
Java Developer
Created on 06/10/2025 22:49
@Last Modified 06/10/2025 22:49
Version 1.0
*/

package com.juaracoding.mmzf_ujian_minggu_1;
import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah tiket: ");
        int jumlahTiket = input.nextInt();
        System.out.print("Apakah hari weekend? (true/false): ");
        boolean weekend = input.nextBoolean();

        int harga = weekend ? 45000 : 35000;
        double total = harga * jumlahTiket;

        if (jumlahTiket > 5) {
            total = total - (total * 0.10);
        }

        System.out.println("Jumlah tiket: " + jumlahTiket);
        System.out.println("Total harga (dengan diskon jika ada): " + (int) total);
        input.close();
    }
}

