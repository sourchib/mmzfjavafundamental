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
import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] film = new String[5];

        System.out.println("Daftar film bioskop");
        for (int i = 0; i < film.length; i++) {
            System.out.print("Masukkan nama film " + (i + 1) + ": ");
            film[i] = input.nextLine();
        }

        System.out.println("\nFilm yang ingin ditonton:");
        for (int i = 0; i < film.length; i++) {
            System.out.println((i + 1) + ". " + film[i]);
        }

        input.close();
    }
}

