package org.backend.trackmate.repositories;

import org.backend.trackmate.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
}