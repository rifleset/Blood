package com.example.Blood.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Blood.model.Donation;

@Repository
public interface DonationRepository extends JpaRepository<Donation, Long> {
    // Additional query methods if required
}
