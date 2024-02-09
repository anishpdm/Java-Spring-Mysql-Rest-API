package com.logix.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Studentmodel,Long> {

    @Query(value = "SELECT * FROM `studentmodel` WHERE `password`=?2 and `username`=?1 ", nativeQuery = true)
    Studentmodel login(String username, String password);


    @Query(value = "SELECT * FROM `studentmodel` ", nativeQuery = true)
    List<Studentmodel> viewAll();
}
