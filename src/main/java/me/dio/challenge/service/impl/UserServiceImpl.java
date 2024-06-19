package me.dio.challenge.service.impl;

import me.dio.challenge.domain.model.User;
import me.dio.challenge.domain.repository.UserRepository;
import me.dio.challenge.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public  UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if(userRepository.existsByEmail(userToCreate.getEmail())){
            throw new IllegalArgumentException("This E-mail is already in use");
        }
        return userRepository.save(userToCreate);
    }
}
