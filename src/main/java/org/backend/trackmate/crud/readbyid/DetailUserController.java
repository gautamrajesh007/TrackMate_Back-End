package org.backend.trackmate.crud.readbyid;


import org.backend.trackmate.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users/list_user")
public class DetailUserController {

    @Autowired
    DetailUserService service;

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Optional<User>> listUser_whenGetUser(@PathVariable Long id){
        return ResponseEntity.ok().body(service.listUser(id));
    }

}
