package com.rocketseat.certification_nlw.modules.students.repositores;

import java.util.List;
import java.util.UUID;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rocketseat.certification_nlw.modules.students.controllers.entities.CertificationStudentsEntity;

@Repository
public interface CertificationStudentRepository extends JpaRepository<CertificationStudentsEntity, UUID>{

    @Query("SELECT c FROM certifications c INNER JOIN c.studentEntity std WHERE std.email = :email AND c.technology = :technology")
    List<CertificationStudentsEntity> findByStudentEmailAndTechnology(String email, String technology);
}
