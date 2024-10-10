package com.example.esTestCrud.repositories;

import com.example.esTestCrud.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositories extends JpaRepository<User, Long> {
}
