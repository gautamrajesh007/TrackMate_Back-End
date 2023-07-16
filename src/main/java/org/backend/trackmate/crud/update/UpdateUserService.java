//package org.backend.trackmate.crud.update;
//
//
//
//
//import org.backend.trackmate.details.UserNotFoundException;
//import org.backend.trackmate.entities.User;
//import org.backend.trackmate.repositories.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//public class UpdateUserService {
//
//    @Autowired
//    UserRepository repository;
//
//    public User updateUser(Long id, User User){
//        Optional<User> userOptional = repository.findById(id);
//        if (userOptional.isEmpty()){
//            throw new UserNotFoundException(id);
//        }
//        else {
//            repository.findById(id);
//            return repository.save(User);
//        }
//    }
//}
