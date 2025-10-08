package com.juaracoding.oop;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author LENOVO a.k.a. M Muchib Zainul Fikry
Java Developer
Created on 08/10/2025 20:14
@Last Modified 08/10/2025 20:14
Version 1.0
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class RegexExpresiPassword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan password: ");
        String password = input.nextLine();

        if (isValidPassword(password)) {
            System.out.println("✅ Password valid!");
        } else {
            System.out.println("❌ Password tidak valid!");
            System.out.println("Syarat:");
            System.out.println("- Minimal 1 huruf kecil");
            System.out.println("- Minimal 1 huruf besar");
            System.out.println("- Minimal 1 angka");
            System.out.println("- Minimal 1 karakter spesial (_ - # $ @)");
            System.out.println("- Panjang 9 sampai 16 karakter");
        }

        input.close();
    }

    public static boolean isValidPassword(String password) {
        // Pola regex sesuai aturan
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[_\\-#$@])[A-Za-z\\d_\\-#$@]{9,16}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
