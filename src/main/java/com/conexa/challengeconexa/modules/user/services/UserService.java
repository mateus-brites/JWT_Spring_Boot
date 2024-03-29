package com.conexa.challengeconexa.modules.user.services;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.conexa.challengeconexa.modules.user.entities.UserEntity;
import com.conexa.challengeconexa.modules.user.repositories.UserRepository;

@Service
public class UserService {
    final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public UserEntity create(UserEntity userEntity) {
        String password = userEntity.getPassword();
        String hash = new BCryptPasswordEncoder().encode(password);

        userEntity.setPassword(hash);
        return this.userRepository.save(userEntity);
    }
}
