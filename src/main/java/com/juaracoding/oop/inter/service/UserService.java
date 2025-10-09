package com.juaracoding.oop.inter.service;

import com.juaracoding.oop.inter.IFile;
import com.juaracoding.oop.inter.IReport;
import com.juaracoding.oop.inter.IService;
import com.juaracoding.oop.inter.model.User;

import java.util.Date;
import java.util.List;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author LENOVO a.k.a. M Muchib Zainul Fikry
Java Developer
Created on 09/10/2025 20:13
@Last Modified 09/10/2025 20:13
Version 1.0
*/
public class UserService implements IService<User>, IReport<User>, IFile {
    @Override
    public void save (User user){
        if(user==null){
            System.out.println("DATA TIDAK VALID - SLF01V001");
        }
        try{

        }catch (ArithmeticException e){
            System.out.println("INTERNAL SERVER ERROR - SLF01E");
        }catch (IllegalArgumentException e){
            System.out.println("INTERNAL SERVER ERROR - SLF01E");
        }catch(NullPointerException e){
            System.out.println("INTERNAL SERVER ERROR - SLF01E");
        }catch(Exception e){
            System.out.println("INTERNAL SERVER ERROR - SLF01E");
        }
    }

    @Override
    public void update(Long id, User user) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void saveAll(List<User> l) {

    }

    @Override
    public void findAll() {

    }

    @Override
    public void findById() {

    }

    @Override
    public void findByParam(String column, String value) {

    }

    @Override
    public void findByParam(String column, String value, Date from, Date to) {

    }

    @Override
    public void downloadPDF(User user) {

    }

    @Override
    public void downloadExsel(User user) {

    }
}
