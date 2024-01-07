package com.example.Blood.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Blood.model.BloodBankInventory;
import com.example.Blood.repository.BloodBankInventoryRepository;

import java.util.List;

@Service
public class BloodBankInventoryService {

    @Autowired
    private BloodBankInventoryRepository inventoryRepository;

    public List<BloodBankInventory> getAllInventory() {
        return inventoryRepository.findAll();
    }

    // Additional methods
}
