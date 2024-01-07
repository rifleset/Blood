package com.example.Blood.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Blood.model.Notification;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {
    // Additional query methods if needed
}
