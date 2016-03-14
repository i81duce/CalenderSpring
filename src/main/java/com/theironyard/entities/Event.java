package com.theironyard.entities;//Created by KevinBozic on 3/14/16.

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "events")
public class Event {
    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false)
    String description;

    @Column(nullable = false)
    LocalDateTime dateTime;

    @ManyToOne
    User user;

    public Event(String description, LocalDateTime dateTime, User user) {
        this.description = description;
        this.dateTime = dateTime;
        this.user = user;
    }

    public Event() {
    }
}
