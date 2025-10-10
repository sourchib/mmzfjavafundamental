package com.juaracoding.collection;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author LENOVO a.k.a. M Muchib Zainul Fikry
Java Developer
Created on 10/10/2025 19:23
@Last Modified 10/10/2025 19:23
Version 1.0
*/
public class Student {

    private String nama;
    private String nis;
    private String alamat;

    // ✅ Constructor kosong (default)
    public Student() {
    }

    // ✅ Constructor dengan parameter
    public Student(String nama, String nis, String alamat) {
        this.nama = nama;
        this.nis = nis;
        this.alamat = alamat;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNis() {
        return nis;
    }

    public void setNis(String nis) {
        this.nis = nis;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + "\nNIS: " + nis + "\nAlamat: " + alamat;
    }
}
