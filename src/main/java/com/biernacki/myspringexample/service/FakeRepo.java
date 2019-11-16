package com.biernacki.myspringexample.service;

import com.biernacki.myspringexample.domain.User;
import com.biernacki.myspringexample.repsitory.UserAccess;
import org.springframework.stereotype.Repository;


import java.util.Arrays;
import java.util.List;


@Repository
public class FakeRepo implements UserAccess {

    @Override
    public List<User> readAllUsers() {
        return Arrays.asList(
                new User("admin","admin"),
                new User("milosz","milosz")
        );
    }
}




