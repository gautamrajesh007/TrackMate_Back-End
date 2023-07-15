package org.backend.trackmate.repositories;

import org.backend.trackmate.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByRole(String roles);
}
