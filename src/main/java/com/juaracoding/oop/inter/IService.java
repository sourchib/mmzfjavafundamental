package com.juaracoding.oop.inter;
import java.util.Date;
import java.util.List;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author LENOVO a.k.a. M Muchib Zainul Fikry
Java Developer
Created on 09/10/2025 20:05
@Last Modified 09/10/2025 20:05
Version 1.0
*/
public interface IService<T> {
    public void save(T t); //001-010
    public void update(Long id, T t); //011-020
    public void delete(Long id); //021-030
    public void saveAll(List<T> l); //031-040
    public void findAll();//041-050
    public void findById();//051-060
    public void findByParam(String column, String value);//061-070
    public void findByParam(String column, String value, Date from, Date to);//071-080
}