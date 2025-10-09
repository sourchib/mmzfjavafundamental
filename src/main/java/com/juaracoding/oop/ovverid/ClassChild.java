package com.juaracoding.oop.ovverid;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author LENOVO a.k.a. M Muchib Zainul Fikry
Java Developer
Created on 09/10/2025 19:18
@Last Modified 09/10/2025 19:18
Version 1.0
*/
public class ClassChild extends ClassParent {
    public int intX ;
    public ClassChild(){
        super();
    }

//    public class

    public void setIntX(int intX){
        this.intX = intX;
    }

//    @Override
//    public void fungsiOne(){
//        System.out.println("Fungsi One");
//
//        /**
//         * *statys
//         * timestamp
//         * data
//         * message
//         * error_code
//         */
//    }

//    protected void fungsiOne(){
//
//    }

    protected void fungsiOne(String x, int intX){
        super.fungsiOne();
//        super.intX=10;
        this.intX=20;
    }


}


