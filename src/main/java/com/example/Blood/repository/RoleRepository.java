package com.example.Blood.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Blood.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    // Custom query methods can be added here
}
