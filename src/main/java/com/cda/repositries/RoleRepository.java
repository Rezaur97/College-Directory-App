package com.cda.repositries;

import com.cda.entities.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoleRepository extends JpaRepository<Roles,Long> {

    @Override
    List<Roles> findAll();
}
