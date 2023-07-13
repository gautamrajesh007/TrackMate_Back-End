package org.backend.trackmate.crud.read;

import org.backend.trackmate.entities.adminUser;
import org.backend.trackmate.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListUserService {

    @Autowired
    UserRepository repository;

    public List<adminUser> listAllUser(){
        return (List<adminUser>) repository.findAll();
    }
}
