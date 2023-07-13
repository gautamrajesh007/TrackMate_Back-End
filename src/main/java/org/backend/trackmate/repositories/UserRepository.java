package org.backend.trackmate.repositories;

import org.backend.trackmate.entities.adminUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<adminUser, Long> {
}