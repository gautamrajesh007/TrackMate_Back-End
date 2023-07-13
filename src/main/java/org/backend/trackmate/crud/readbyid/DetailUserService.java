package org.backend.trackmate.crud.readbyid;

import org.backend.trackmate.entities.adminUser;
import org.backend.trackmate.repositories.UserRepository;
import org.backend.trackmate.details.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DetailUserService {

    @Autowired
    UserRepository repository;

    public Optional<adminUser> listUser(Long id){
        Optional<adminUser> user = repository.findById(id);

        if(user.isEmpty()){
        throw new UserNotFoundException(id);
        }
        else {
            return repository.findById(id);
        }
    }

}
