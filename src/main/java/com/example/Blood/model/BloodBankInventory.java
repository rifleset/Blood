package com.example.Blood.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "blood_bank_inventory")
public class BloodBankInventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String bloodGroup;
    private int quantity; // Quantity of blood units available
    private Date lastUpdated; // Last update timestamp

    // Standard getters and setters
}
