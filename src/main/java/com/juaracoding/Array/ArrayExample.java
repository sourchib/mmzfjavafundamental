/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author LENOVO a.k.a. M Muchib Zainul Fikry
Java Developer
Created on 06/10/2025 20:02
@Last Modified 06/10/2025 20:02
Version 1.0
*/

package com.juaracoding.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
//            // Menentukan jumlah angka yang akan disimpan
//            System.out.print("Masukkan jumlah angka yang ingin disimpan: ");
//            int jumlah = input.nextInt();
//
//            // Membuat array sesuai jumlah input
//            int[] angka = new int[jumlah];
//
//            // Memasukkan angka ke dalam array
//            for (int i = 0; i < angka.length; i++) {
//                System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
//                angka[i] = input.nextInt();
//            }
//
//            // Menampilkan semua angka yang disimpan
//            System.out.println("\n=== Daftar Angka yang Disimpan ===");
//            for (int i = 0; i < angka.length; i++) {
//                System.out.println("Angka ke-" + (i + 1) + ": " + angka[i]);
//            }

            // Membuat array dengan 5 elemen
            int[] grade = new int[5];

            // Mengisi nilai ke dalam array
            grade[0] = 91;
            grade[1] = 92;
            grade[2] = 93;
            grade[3] = 94;
            grade[4] = 95;

            // Menampilkan satu nilai dari array
            System.out.println(grade[4]); // Output: 95

            // Variabel String
            String alamat = "Jakarta";
            alamat = "Bandung"; // Mengganti nilai variabel alamat

            // Menampilkan alamat
            System.out.println(alamat);

            // Menampilkan seluruh nilai array dengan looping
            for (int i = 0; i < grade.length; i++) {
                System.out.println(grade[i]);
            }

            // Bagian 2: Array string (mobil)
            String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
            // Loop for-each
            for (String car : cars) {
                System.out.println(car);
            }

            int[][] numbers = {{1,2,3,4},{5,6,7}};
            System.out.println(numbers[1][1]);
            System.out.println(numbers[0][2]);
            for (int i = 0; i < numbers.length; i++) {
                for (int j = 0; j < numbers.length; j++) {
                    System.out.println(numbers[i][j]);
                }
            }

//           TotalAndAvarageGrade();

            String[] cities = {"Bandung","Jakarta","Surabaya","Palu","Bekasi"};
            //buat fungsi mencari data kota
            //kalau tidak ada keterangan dalam cities sedangkan kalau ketemu ketemu
            // kalau ketemu masuk ke index berapa
            //buat fungsi mencari kata terpanjang gunakan lengs

            // Sorting
            sortCities(cities);

            // Contoh penggunaan fungsi pencarian
            searchCity(cities, "Surabaya");
            searchCity(cities, "Medan");

            // Mencari kota dengan kata terpanjang
            findLongestCity(cities);

        } catch (Exception e) {
            System.out.println("fail");
        } finally {
            input.close();
            System.out.println("\nProgram selesai.");
        }
    }
//    static void TotalAndAvarageGrade(int[] grades){
//        int sum = 0;
//        for (int i = 0; 1 < grade.length; i++) {
//            sum += grade[1]; // sum=sum+grade[i]
//
//        }
//        System.out.println("Total Grades = " + sum);
//        System.out.println("Rata-rata Grade =" + sum / grade.length);
//    }

    // Fungsi untuk mencari kota
    public static void searchCity(String[] cities, String city) {
        boolean found = false;
        for (int i = 0; i < cities.length; i++) {
            if (cities[i].equalsIgnoreCase(city)) { // tidak sensitif huruf besar/kecil
                System.out.println("Kota " + city + " ditemukan di index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Kota " + city + " tidak ditemukan dalam array.");
        }
    }

    // Fungsi untuk mencari kota dengan kata terpanjang
    public static void findLongestCity(String[] cities) {
        String longest = cities[0];
        for (String city : cities) {
            if (city.length() > longest.length()) {
                longest = city;
            }
        }
        System.out.println("Kota dengan nama terpanjang adalah: " + longest + " (" + longest.length() + " huruf)");
    }

    // Fungsi untuk mengurutkan array
    public static void sortCities(String[] cities) {
        Arrays.sort(cities); // mengurutkan secara alfabetis
        System.out.println("Array cities setelah diurutkan: " + Arrays.toString(cities));
    }

}

