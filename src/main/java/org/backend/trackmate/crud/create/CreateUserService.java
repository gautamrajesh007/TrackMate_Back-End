package org.backend.trackmate.crud.create;

import org.backend.trackmate.entities.User;
import org.backend.trackmate.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateUserService {

    @Autowired
    UserRepository repository;

    public User createNewUser(User User) {
        return repository.save(User);
    }
}
