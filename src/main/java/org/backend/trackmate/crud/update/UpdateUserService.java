package org.backend.trackmate.crud.update;




import org.backend.trackmate.details.UserNotFoundException;
import org.backend.trackmate.entities.Users;
import org.backend.trackmate.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UpdateUserService {

    @Autowired
    UserRepository repository;

    public Users updateUser(Long id, Users Users){
        Optional<Users> userOptional = repository.findById(id);
        if (userOptional.isEmpty()){
            throw new UserNotFoundException(id);
        }
        else {
            repository.findById(id);
            return repository.save(Users);
        }
    }
}
