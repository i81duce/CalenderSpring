package com.theironyard.entities;//Created by KevinBozic on 3/14/16.

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false)
    String name;

    public User(String name) {
        this.name = name;
    }

    public User() {
    }
}
