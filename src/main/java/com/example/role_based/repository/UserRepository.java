package com.example.role_based.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.role_based.entity.Role;
import com.example.role_based.entity.User;

@Repository
@EnableJpaRepositories
public interface UserRepository extends JpaRepository<User, UUID> {

 Optional<User> findByEmail(String email);
 Optional<User> findByRole(Role role);
void save(Object user);

}