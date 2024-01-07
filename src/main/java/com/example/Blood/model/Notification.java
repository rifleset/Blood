package com.example.Blood.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private String content;
    private LocalDate date;
    private Boolean isRead;

    // Getters and setters
}
