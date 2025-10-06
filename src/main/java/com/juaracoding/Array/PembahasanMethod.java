/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author LENOVO a.k.a. M Muchib Zainul Fikry
Java Developer
Created on 06/10/2025 20:42
@Last Modified 06/10/2025 20:42
Version 1.0
*/

package com.juaracoding.Array;

public class PembahasanMethod {
    public static void main(String[] args) {

        //void
        double sub1 = subtotal(15000000, 1,0.1f);
        double sub2 = subtotal( 10000000, 3, 0.1f );

        System.out.println(sub1);
        System.out.printf("%.2f\n",sub1);
        //return untuk pengembalian nilai

    }

    static double subtotal(int price, int amount, float discount){
        double priceDiscount = price-(price*discount);
        return priceDiscount*amount;
    }

    //1.0.0 ada 3 pembaruan version terdiri dari tiga angka

}
