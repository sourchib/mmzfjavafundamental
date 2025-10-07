package com.juaracoding.method.contohstatic;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author LENOVO a.k.a. M Muchib Zainul Fikry
Java Developer
Created on 07/10/2025 20:01
@Last Modified 07/10/2025 20:01
Version 1.0
*/
public class FungsiTwo
{
    public static void main(String[] args) {
        FungsiOne fungsiOne1 = new FungsiOne();
        System.out.println("Alamat fungsiOne 1"+fungsiOne1);
        fungsiOne1.printx();
        FungsiOne fungsiOne2 = new FungsiOne();
        System.out.println("Alamat fungsiOne 2"+fungsiOne2);
        fungsiOne2.printx();
        FungsiOne fungsiOne3 = new FungsiOne();
        System.out.println("Alamat fungsiOne 3"+fungsiOne3);
        fungsiOne3.printx();

//        FungsiOne fungsiOne1 = new FungsiOne();
        System.out.println(fungsiOne1);
        FungsiTwo FungsiTwo = new FungsiTwo();
        FungsiTwo.pangil();
    }

    public void pangil(){
        System.out.println("Fungsi Pangil");
    }

}