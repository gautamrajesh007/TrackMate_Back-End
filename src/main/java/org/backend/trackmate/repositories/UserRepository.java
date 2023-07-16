package org.backend.trackmate.repositories;

import org.backend.trackmate.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserName(String username);
    User findByEmail(String email);
}