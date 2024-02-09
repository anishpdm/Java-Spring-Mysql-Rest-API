package com.logix.demo;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Studentmodel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty("name")
    private String name;


    @JsonProperty("rollNo")
    private String rollNo;

    @JsonProperty("admNo")
    private String admNo;

    @JsonProperty("username")
    private String username;

    @JsonProperty("password")
    private String password;


    public Studentmodel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getAdmNo() {
        return admNo;
    }

    public void setAdmNo(String admNo) {
        this.admNo = admNo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Studentmodel(Long id, String name, String rollNo, String admNo, String username, String password) {
        this.id = id;
        this.name = name;
        this.rollNo = rollNo;
        this.admNo = admNo;
        this.username = username;
        this.password = password;
    }
}
