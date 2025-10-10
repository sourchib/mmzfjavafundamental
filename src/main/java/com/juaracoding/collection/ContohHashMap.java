package com.juaracoding.collection;
import java.util.HashMap;
import java.util.Map;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author LENOVO a.k.a. M Muchib Zainul Fikry
Java Developer
Created on 10/10/2025 20:09
@Last Modified 10/10/2025 20:09
Version 1.0
*/
public class ContohHashMap {

    public static void main(String[] args) {
        Student s = new Student();
        s.setNis("1212121");
        s.setAlamat("Bogor");
        s.setNama("Ayu");

        System.out.println(s.getNama());

        System.out.println(s.getNis());
        System.out.println(s.getAlamat());

        HashMap<String,Object> map= new HashMap();
        map.put("nama","Ayu");
        map.put("alamat","Bogor");
        map.put("nis","1212121");

        for (Map.Entry<String, Object> x : map.entrySet()) {
                System.out.println("Key: " + x.getKey() + ", Value: " + x.getValue());
        }

        System.out.println(map.get("nama"));
        System.out.println(map.get("alamat"));
        System.out.println(map.get("nis"));

    }
}


