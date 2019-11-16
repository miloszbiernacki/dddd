package com.biernacki.myspringexample.repsitory;

import com.biernacki.myspringexample.domain.User;

import java.util.List;

public interface UserAccess {
    List<User> readAllUsers();

}
