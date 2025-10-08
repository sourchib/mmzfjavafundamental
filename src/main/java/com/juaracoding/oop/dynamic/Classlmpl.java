package com.juaracoding.oop.dynamic;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author LENOVO a.k.a. M Muchib Zainul Fikry
Java Developer
Created on 08/10/2025 21:23
@Last Modified 08/10/2025 21:23
Version 1.0
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Classlmpl {
    public static void main(String[] args) throws InterruptedException {
        ClassOne c0ne = new ClassTwo();
        ClassTwo classTwo = new ClassTwo();
        classTwo.fungsiEmpat();

        List l = new ArrayList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);

        l.clear(); //ketika membuat list lagi jangan lupa untuk clearlist

        l.add(2);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.length();
        String str = "abcdef";
        int intLength = str.length();

        String strToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiYWRtaW4iOnRydWUsImlhdCI6MTUxNjIzOTAyMn0.KMUFsIDTnFmyG3nMiGM6H9FNFUROf3wh7SmqJp-QV30";
        Object jwtUtil = "";

//        Map m = jwtUtil.mapToken();
//        String username = jwtUtil.getUserName(strToken);
//        String userID = jwtUtil.getUserId(strToken)
//        String email = jwtUtil.getEmail(strToken);
//        String noHp = jwtUtil.getNoHp(strToken);

    }
}

