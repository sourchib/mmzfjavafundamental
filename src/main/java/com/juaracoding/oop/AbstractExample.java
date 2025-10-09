package com.juaracoding.oop;

/*
    IntelliJ IDEA 2022.3.1 (Community Edition)
    Build #IC-223.8214.52, built on December 20, 2022
    @Author LENOVO a.k.a. M Muchib Zainul Fikry
    Java Developer
    Created on 09/10/2025 19:43
    @Last Modified 09/10/2025 19:43
    Version 1.0
    */
public class AbstractExample {
    public static void main(String[] args) {
        System.out.println("Muali !!");
        //        for (int i = 0; i < 3; i++){
        //            System.out.println("Nilai i"+(i+1));
        //        }

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i =0; i <3; i++){
                    System.out.println("Nilai i"+(i+1));
                }
            }
        });
        t.start();
        System.out.println("Berakhir"+Thread.currentThread().getName());
    }
}