package com.biernacki.myspringexample.service;

import com.biernacki.myspringexample.domain.User;
import com.biernacki.myspringexample.repsitory.UserAccess;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class UserService {

    private UserAccess userrepository2;

    public UserService(UserAccess userrepository2) {
        this.userrepository2 = userrepository2;
    }





public List<User> getAllUsers(){
    return userrepository2.readAllUsers();
}
}
