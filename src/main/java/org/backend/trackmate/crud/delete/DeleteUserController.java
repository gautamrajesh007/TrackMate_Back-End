//package org.backend.trackmate.crud.delete;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/users/delete_users")
//public class DeleteUserController {
//
//    @Autowired
//    DeleteUserService service;
//
//    @DeleteMapping("/{id}")
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    public void deleteUser_whenDeleteUser(@PathVariable Long id){
//        service.deleteUser(id);
//    }
//}
