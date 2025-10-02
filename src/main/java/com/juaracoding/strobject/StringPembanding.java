package com.juaracoding.strobject;


public class StringPembanding {

    public static void main(String[] args) {
        String x = "Paul";
//        String y = "Paul";
        String y = new String("Paul");
        System.out.println("Alokasi X : "+System.identityHashCode(x));
        System.out.println("Alokasi Y : "+System.identityHashCode(y));
        System.out.println("Nilai X : "+x);
        System.out.println("Nilai Y : "+y);
        System.out.println(x==y);
        System.out.println(x.equals(y));

        String strFirst = "Paul";
        String strSecond = "paul";
        System.out.println(strFirst.equalsIgnoreCase(strSecond));

        System.out.println("Str First "+strFirst.toUpperCase());
        System.out.println("Str Second "+strSecond.toUpperCase());

        String strSub = "Welcome";
        System.out.println(strSub.substring(2));
        System.out.println(strSub.substring(2,5));
        String auth = "Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJwYXVsLjEyMyIsImhwIjoiMDgxMjEzMTQxMzIxIiwiZW0iOiJwb2xsLmNoaWh1eUBnbWFpbC5jb20iLCJpZCI6MSwibmFsZW5nIjoiUGF1bCBNYWxhdSIsImV4cCI6MTc1Njk5ODAyMSwiaWF0IjoxNzU2OTk2MjIxfQ.LLJrwtm8AMwfMOpne69hMobmDRvZMt_wS8f2axEKx2_m7yMiQ1ZcYImL1ouooBpLlfbFGcDFfc_mN899NSb7nA";
        System.out.println(auth.substring(7));
    }
}

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author LENOVO a.k.a. M Muchib Zainul Fikry
Java Developer
Created on 02/10/2025 21:00
@Last Modified 02/10/2025 21:00
Version 1.0
*/
