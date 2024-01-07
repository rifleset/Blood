package com.example.Blood.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "events")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Date eventDate;
    private String location;
    private String description; // Details about the event

    // Standard getters and setters
}
