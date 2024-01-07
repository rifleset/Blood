package com.example.Blood.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.Blood.model.HealthRecord;
import com.example.Blood.service.HealthRecordService;

import java.util.List;

@RestController
@RequestMapping("/api/healthrecords")
public class HealthRecordController {

    @Autowired
    private HealthRecordService healthRecordService;

    @GetMapping
    public ResponseEntity<List<HealthRecord>> getAllHealthRecords() {
        return ResponseEntity.ok(healthRecordService.getAllHealthRecords());
    }

    // Additional endpoints
}
