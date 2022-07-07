package com.bootcamp.w6.miniProj.RestAPIminiProj.service;

import com.bootcamp.w6.miniProj.RestAPIminiProj.exception.RecordNotFoundException;
import com.bootcamp.w6.miniProj.RestAPIminiProj.models.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {

    //--------CREATE EMPLOYEE---------
    User saveUser(User user);

    //--------RETRIEVE EMPLOYEE---------
    Page<User> getUser(Pageable pageable);

    //--------UPDATE EMPLOYEE---------
    User updateUserById(User user, Long id) throws RecordNotFoundException;

    //--------DELETE EMPLOYEE---------
    String deleteUser(Long id) throws RecordNotFoundException;

    //--------GET EMPLOYEE BY ID---------
    User getUserById(Long id) throws RecordNotFoundException;
}
