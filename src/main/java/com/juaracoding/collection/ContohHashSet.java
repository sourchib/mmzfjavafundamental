package com.juaracoding.collection;

import java.util.HashSet;
import java.util.Iterator;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author LENOVO a.k.a. M Muchib Zainul Fikry
Java Developer
Created on 10/10/2025 20:02
@Last Modified 10/10/2025 20:02
Version 1.0
*/
public class ContohHashSet {
    public static void main(String[] args) {
        Student s = new Student ("Fadli", "121212121","Jakarta");
        HashSet h  = new HashSet();

        h.add(s);
        h.add(s);
        h.add(1);
        h.add(2);
        h.add(2);
        System.out.println(h);
        Iterator i = h.iterator();
        while (i.hasNext()){
            System.out.println("dataA:"+i.next());
        }
    }
}


