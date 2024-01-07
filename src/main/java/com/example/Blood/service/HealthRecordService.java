package com.example.Blood.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Blood.model.HealthRecord;
import com.example.Blood.repository.HealthRecordRepository;

import java.util.List;

@Service
public class HealthRecordService {

    @Autowired
    private HealthRecordRepository healthRecordRepository;

    public List<HealthRecord> getAllHealthRecords() {
        return healthRecordRepository.findAll();
    }

    // Additional methods
}
