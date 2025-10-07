/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author LENOVO a.k.a. M Muchib Zainul Fikry
Java Developer
Created on 07/10/2025 11:16
@Last Modified 07/10/2025 11:16
Version 1.0
*/

package com.juaracoding.Array;
import java.util.Arrays;

public class NamakotaMethod {

    public static void main(String[] args) {
        String[] cities = {"Bandung","Jakarta","Surabaya","Palu","Bekasi"};

        // Sorting
        sortCities(cities);

        // Contoh penggunaan fungsi pencarian
        searchCity(cities, "Surabaya");
        searchCity(cities, "Medan");

        // Mencari kota dengan kata terpanjang
        findLongestCity(cities);
    }


    // Fungsi untuk mengurutkan array
    public static void sortCities(String[] cities) {
        Arrays.sort(cities); // mengurutkan secara alfabetis
        System.out.println("Array cities setelah diurutkan: " + Arrays.toString(cities));
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
}

