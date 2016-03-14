package com.theironyard.entities;//Created by KevinBozic on 3/14/16.

import javax.persistence.*;

@Entity
@Table(name = "favorites")
public class Favorite {
    @Id
    @GeneratedValue
    int id;

    @ManyToOne
    User user;

    @ManyToOne
    Event event;

    public Favorite(User user, Event event) {
        this.user = user;
        this.event = event;
    }

    public Favorite() {
    }
}
