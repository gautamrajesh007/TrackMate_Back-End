package org.backend.trackmate.crud.create;

import org.backend.trackmate.entities.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/users/create_user")
public class CreateUserController {

    @Autowired
    CreateUserService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Users> createNewUser_whenPostUser(@RequestBody Users Users) {
        Users createAdminTable = service.createNewUser(Users);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(createAdminTable.getId()).toUri();
        return ResponseEntity.created(uri).body(createAdminTable);
    }

}
