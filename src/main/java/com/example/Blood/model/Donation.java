package com.example.Blood.model;

import com.example.Blood.model.User;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Donation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private LocalDate date;
    private Double quantity;
    private String status; // e.g., CONFIRMED, COMPLETED

    // Getters and setters
}
