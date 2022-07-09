package com.bootcamp.w6.miniProj.RestAPIminiProj.controller;

import com.bootcamp.w6.miniProj.RestAPIminiProj.exception.RecordNotFoundException;
import com.bootcamp.w6.miniProj.RestAPIminiProj.models.Employee;
import com.bootcamp.w6.miniProj.RestAPIminiProj.models.User;
import com.bootcamp.w6.miniProj.RestAPIminiProj.service.EmployeeService;
import com.bootcamp.w6.miniProj.RestAPIminiProj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    //++++++++++++++++++++++++++++++++++++++-CREATE/ADD USER-+++++++++++++++++++++++++++++++++++++++++++
    @PostMapping
    ResponseEntity<User> createUser(@RequestBody User user) {
        return new ResponseEntity<>(userService.saveUser(user), HttpStatus.CREATED);
    }

    //++++++++++++++++++++++++++++++++++++++-RETRIEVE ALL USERS-++++++++++++++++++++++++++++++++++++++++
    @GetMapping
    ResponseEntity<Page<User>> getAllEmployees(Pageable pageable) {
        return new ResponseEntity<>(userService.getUser(pageable), HttpStatus.OK);
    }

    //++++++++++++++++++++++++++++++++++++++-UPDATE USER BY ID-++++++++++++++++++++++++++++++++++++++++++
    @PutMapping("/{id}")
    ResponseEntity<User> updatedUserById(@PathVariable Long id, @RequestBody User user) throws RecordNotFoundException {
        return new ResponseEntity<>(userService.updateUserById(user, id), HttpStatus.ACCEPTED);
    }

    //+++++++++++++++++++++++++++++++++++++++++-DELETE USER-++++++++++++++++++++++++++++++++++++++++++++++
    @DeleteMapping("/{id}")
    ResponseEntity <String> deleteUser(@PathVariable Long id) throws RecordNotFoundException {
        return new ResponseEntity<>(userService.deleteUser(id), HttpStatus.ACCEPTED);
    }

    //++++++++++++++++++++++++++++++++++++++-CHECK USER BY ID-+++++++++++++++++++++++++++++++++++++++++++++
    @GetMapping("/{id}")
    ResponseEntity<User> getEmployeeById(@PathVariable Long id) throws RecordNotFoundException {
        return new ResponseEntity<>(userService.getUserById(id), HttpStatus.OK);
    }
}

