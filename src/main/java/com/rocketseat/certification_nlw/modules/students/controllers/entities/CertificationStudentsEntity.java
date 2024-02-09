package com.rocketseat.certification_nlw.modules.students.controllers.entities;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "certifications")

public class CertificationStudentsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)

    private UUID id;
    
    @Column(length = 100)
    private String technology;

    @Column(length = 10)
    private int grade;

    @JoinColumn(name = "student_id")
    private UUID studentID;

    //private List<AnswersCertificationsEntity> answersCertificationsEntities;  
}
