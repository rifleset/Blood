package com.example.Blood.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Blood.model.HealthRecord;

@Repository
public interface HealthRecordRepository extends JpaRepository<HealthRecord, Long> {
    // Custom query methods can be added here
}
