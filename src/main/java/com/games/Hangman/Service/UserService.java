package com.games.Hangman.Service;

import com.games.Hangman.Entities.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public interface UserService extends UserDetailsService {

    User registerUser(User user);

}
