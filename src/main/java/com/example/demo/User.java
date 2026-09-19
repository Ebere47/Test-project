package com.example.demo;

public class User {
    private Long id;
    private String name;
    private String email;

    /*
    Constructors
    1. No Argument constructor (object default)
    2. All Argument constructor
    3. Required Argument constructor
    */

    //No Args constructor
    public User() {
    }

    //All Args constructor
    public User(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    //Required Args constructor
    public User(Long id, String name){
        this.id = id;
        this.name = name;
    }

    public User(Long id) {
        this.id = id;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
