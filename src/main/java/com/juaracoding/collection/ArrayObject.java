package com.juaracoding.collection;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author LENOVO a.k.a. M Muchib Zainul Fikry
Java Developer
Created on 10/10/2025 19:11
@Last Modified 10/10/2025 19:30
Version 1.1
*/

public class ArrayObject {
    public static void main(String[] args) {

        // Membuat array object Student berukuran 2
        Student[] stArr = new Student[2];

        // Mengisi elemen array dengan objek Student
        stArr[0] = new Student("Paul", "12244", "Bogor");
        stArr[1] = new Student("Fadli", "43343", "Jakarta");

        // Menampilkan data setiap Student
        System.out.println("=== Data Student ===");
        for (int i = 0; i < stArr.length; i++) {
            System.out.println("Data ke-" + (i + 1));
            System.out.println(stArr[i]);
            System.out.println("===================");
        }
    }
}
