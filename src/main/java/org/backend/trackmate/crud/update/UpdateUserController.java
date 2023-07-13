package org.backend.trackmate.crud.update;


import org.backend.trackmate.entities.adminUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users/update_user")
public class UpdateUserController {

    @Autowired
    UpdateUserService service;

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<adminUser> updateUser_whenPutUser(@PathVariable Long id, @RequestBody adminUser adminUser){
        return ResponseEntity.ok().body(service.updateUser(id, adminUser));
    }
}
