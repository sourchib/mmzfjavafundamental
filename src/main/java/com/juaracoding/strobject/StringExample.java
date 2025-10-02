package com.juaracoding.strobject;

public class StringExample {

    public static void main(String[] args) {
//        String strX = "Pisang";
        System.out.println("Pisang".length());
        System.out.println("Pisang".substring(3));
        String strOne = "abcdef";
        String strTwo = "ghijkl";

        System.out.println(strOne.concat(strTwo));
        System.out.println(strOne+strTwo);
        StringBuilder sBuild = new StringBuilder();
        String strThree = sBuild.append(strOne).append(strTwo).append(strTwo).append(strTwo).append(strTwo).append(strTwo).append(strTwo).append(strTwo).append(strTwo).append(strTwo).append(strTwo).append(strTwo).append(strTwo).append(strTwo).toString();
        sBuild.setLength(0);
        String strFour = new StringBuilder().append(strOne).append(strOne).append(strOne).append(strOne).append(strOne).toString();
        System.out.println("4"+3);
        System.out.println(strOne.length());
        char [] chArr = strOne.toCharArray();
        System.out.println(chArr.length);
        System.out.println("strOne index ke 2 : "+strOne.charAt(2));
        System.out.println("chArr index ke 2 : "+chArr[2]);
        int intK = 4839401;
        String strF = String.valueOf(intK);// 5 langkah
        System.out.println(String.valueOf(intK).length());
        System.out.println(strF.length());
        String strFilbert = "Filbert Funay";
        String strArr [] = strFilbert.split(" ");
        System.out.println(strArr[1]);
        System.out.println(System.currentTimeMillis());
        String strToken = "CODE01$paul@gmail.com-0857743771$1759413102911";
        String strTokenArr [] = strToken.split("\\$");
        for (int i = 0; i < strTokenArr.length; i++) {
            System.out.println(strTokenArr[i]);
        }



    }
}


/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author LENOVO a.k.a. M Muchib Zainul Fikry
Java Developer
Created on 02/10/2025 20:23
@Last Modified 02/10/2025 20:23
Version 1.0
*/
