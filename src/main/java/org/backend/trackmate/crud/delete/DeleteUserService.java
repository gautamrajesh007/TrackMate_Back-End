package org.backend.trackmate.crud.delete;

import org.backend.trackmate.entities.adminUser;
import org.backend.trackmate.details.UserNotFoundException;
import org.backend.trackmate.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DeleteUserService {

    @Autowired
    UserRepository repository;

    public void deleteUser(Long id){
        Optional<adminUser> userOptional = repository.findById(id);

        if (userOptional.isEmpty()){
            throw new UserNotFoundException(id);
        }
        else {
            repository.deleteById(id);
        }
    }
}
