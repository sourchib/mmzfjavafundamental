package com.juaracoding.collection;

import java.util.ArrayList;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author LENOVO a.k.a. M Muchib Zainul Fikry
Java Developer
Created on 10/10/2025 19:23
@Last Modified 10/10/2025 19:23
Version 1.0
*/
public class ArrayListExample {
    //CTRL + R
    public static void main(String[] args) {
        ArrayList<Student> arrStudent = new ArrayList();
        arrStudent.add(new Student("Paul", "12121","Bogor"));
        arrStudent.add(new Student("Fadli", "43343","Jakarta"));
        System.out.println("==============");
        System.out.println("==============");
        for (int i = 0; i < arrStudent.size(); i++){
            System.out.println(arrStudent.get(i).getAlamat());
            System.out.println(arrStudent.get(i).getNis());
            System.out.println(arrStudent.get(i).getNama());
            System.out.println("==============");
        }

        for (Student s:arrStudent){
            System.out.println("==============");
            System.out.println(s.getNama()); //s = arrStudent.get()
            System.out.println(s.getAlamat());
            System.out.println(s.getNis());
            System.out.println("==============");
        }

        arrStudent.get(0).setNama("Kristo");

    }
}


