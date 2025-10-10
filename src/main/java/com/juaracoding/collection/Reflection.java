package com.juaracoding.collection;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author LENOVO a.k.a. M Muchib Zainul Fikry
Java Developer
Created on 10/10/2025 20:40
@Last Modified 10/10/2025 20:40
Version 1.0
*/

public class Reflection {

    // Method untuk mengubah object menjadi Map
    public static Map<String, Object> objectToMap(Object obj) throws IllegalAccessException {
        Map<String, Object> map = new HashMap<>();

        // Dapatkan semua field dari class termasuk private
        Field[] fields = obj.getClass().getDeclaredFields();

        // Loop setiap field
        for (Field field : fields) {
            field.setAccessible(true); // agar field private bisa diakses
            String key = field.getName(); // ambil nama field
            Object value = field.get(obj); // ambil nilai field dari object
            map.put(key, value); // masukkan ke map
        }

//        select nama,alamat,email,umur from m_user;

        return map;
    }
}
