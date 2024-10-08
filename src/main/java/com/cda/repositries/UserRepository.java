package com.cda.repositries;

import com.cda.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Users,Long> {
    Optional<Users> findByUsernameOrEmail(String username, String email);
    Optional<Users> findByEmail(String email);
    Optional<Users> findByUsername(String username);
}
