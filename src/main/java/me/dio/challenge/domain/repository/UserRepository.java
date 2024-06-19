package me.dio.challenge.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.dio.challenge.domain.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByEmail(String email );
}
