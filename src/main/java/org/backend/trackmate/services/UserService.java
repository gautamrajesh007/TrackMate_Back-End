package org.backend.trackmate.services;

import org.backend.trackmate.entities.Role;
import org.backend.trackmate.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
}
