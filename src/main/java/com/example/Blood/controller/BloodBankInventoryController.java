package com.example.Blood.controller;

import com.example.Blood.service.BloodBankInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.Blood.model.BloodBankInventory;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
public class BloodBankInventoryController {

    @Autowired
    private BloodBankInventoryService inventoryService;

    @GetMapping
    public ResponseEntity<List<BloodBankInventory>> getAllInventory() {
        return ResponseEntity.ok(inventoryService.getAllInventory());
    }

    // Additional endpoints
}
