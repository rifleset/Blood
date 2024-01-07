package com.example.Blood.model;

import com.example.Blood.model.User;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "health_records")
public class HealthRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private Date recordDate;
    private String healthStatus; // e.g., "ELIGIBLE", "DEFERRED"
    private String notes; // Additional health notes

    // Standard getters and setters
}
