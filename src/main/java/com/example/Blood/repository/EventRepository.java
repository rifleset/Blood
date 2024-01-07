package com.example.Blood.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Blood.model.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
    // Custom query methods can be added here
}
