package TrimaximumSoftware.trimaximum.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import TrimaximumSoftware.trimaximum.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}