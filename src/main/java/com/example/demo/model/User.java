package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "user_")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "full_name", length = 1000)
    private String myFullName;

    public String getMyFullName() {
        return myFullName;
    }

    public void setMyFullName(String myFullName) {
        this.myFullName = myFullName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}