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

public class Classlmpl {
    public static void main(String[] args) {
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


    }
}

