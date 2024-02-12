package com.rocketseat.certification_nlw.modules.students.repositores;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rocketseat.certification_nlw.modules.students.controllers.entities.StudentEntity;


public interface StudentRepository extends JpaRepository<StudentEntity, UUID>{
    
    public Optional<StudentEntity> findByEmail(String email);
    
}
