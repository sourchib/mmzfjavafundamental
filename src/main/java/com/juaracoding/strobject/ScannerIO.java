package com.juaracoding.strobject;
import java.util.Scanner;

public class ScannerIO {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Angka Bulat : ");
        int nilaiX = sc.nextInt();
        System.out.println("Nilai X adalah : "+nilaiX);
        System.out.print("Masukkan Angka Desimal : ");
        double doubX = sc.nextDouble();
        System.out.println("Nilai doubX  adalah : "+doubX);

        sc.close();

    }

}

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author LENOVO a.k.a. M Muchib Zainul Fikry
Java Developer
Created on 02/10/2025 21:21
@Last Modified 02/10/2025 21:21
Version 1.0
*/
