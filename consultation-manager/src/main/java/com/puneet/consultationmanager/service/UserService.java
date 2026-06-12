package com.puneet.consultationmanager.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.puneet.consultationmanager.dto.LoginRequest;
import com.puneet.consultationmanager.dto.RegisterRequest;
import com.puneet.consultationmanager.entity.User;
import com.puneet.consultationmanager.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    private BCryptPasswordEncoder passwordEncoder =
            new BCryptPasswordEncoder();

    public User register(RegisterRequest request) {

        User user = new User();

        user.setName(request.getName());
        user.setEmail(request.getEmail());
        user.setPassword(
                passwordEncoder.encode(request.getPassword())
        );

        return userRepository.save(user);
    }

    public String login(LoginRequest request) {

        Optional<User> optionalUser =
                userRepository.findByEmail(request.getEmail());

        if (optionalUser.isEmpty()) {
            return "User not found";
        }

        User user = optionalUser.get();

        boolean passwordMatched =
                passwordEncoder.matches(
                        request.getPassword(),
                        user.getPassword()
                );

        if (passwordMatched) {
            return "Login Successful";
        }

        return "Invalid Password";
    }
}