package org.backend.trackmate.crud.create;

import org.backend.trackmate.entities.Users;
import org.backend.trackmate.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateUserService {

    @Autowired
    UserRepository repository;

    public Users createNewUser(Users Users) {
        return repository.save(Users);
    }
}
