package me.dio.challenge.service;

import me.dio.challenge.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
