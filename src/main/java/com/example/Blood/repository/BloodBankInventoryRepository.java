package com.example.Blood.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Blood.model.BloodBankInventory;

@Repository
public interface BloodBankInventoryRepository extends JpaRepository<BloodBankInventory, Long> {
    // Additional query methods if required
}
