package com.juaracoding.Array;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author LENOVO a.k.a. M Muchib Zainul Fikry
Java Developer
Created on 07/10/2025 19:21
@Last Modified 07/10/2025 19:21
Version 1.0
*/
public class ExampleArgs {

    public static void main(String[] args) {
        //url = mssql:jdbc:localhost:1433; databasename=paul
        //usn = paul
        //pwd = paul@123
        if(args!=null && args.length!=0 ){
            System.out.println("Masukkan ke sini !");
            for (int i =0; i < args.length; i++){
                System.out.println(args[i]);
            }
        }
    }
}


