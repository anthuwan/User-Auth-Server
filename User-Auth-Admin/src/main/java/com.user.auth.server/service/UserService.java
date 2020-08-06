package com.user.auth.server.service;
import com.user.auth.server.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
public interface UserService {

    User save(User user);
    List<User> findAll();
}
