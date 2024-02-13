package com.rocketseat.certification_nlw.modules.students.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.rocketseat.certification_nlw.modules.students.UseCases.StudentCertificationAnswerUserCase;
import com.rocketseat.certification_nlw.modules.students.UseCases.VerifyIfHasCertificationUseCase;
import com.rocketseat.certification_nlw.modules.students.entities.CertificationStudentEntity;
import com.rocketseat.certification_nlw.modules.students.dto.StudentCertificationAnswerDTO;
import com.rocketseat.certification_nlw.modules.students.dto.VerifyHasCertificationDTO;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private VerifyIfHasCertificationUseCase verifyIfHasCertificationUseCase;

    @Autowired
    private StudentCertificationAnswerUserCase studentCertificationAnswerUserCase;

    @PostMapping("/verifyIfHasCertification")

    public String verifyIfHasCertification(@RequestBody VerifyHasCertificationDTO verifyHasCertificationDTO){
    
    var result = this.verifyIfHasCertificationUseCase.execute(verifyHasCertificationDTO);
    if(result)
    {
        return "Usuário já fez a prova";
    }
    return "Usuário pode fazer a prova";
    } 

@PostMapping("/certification/answer")    
public CertificationStudentEntity certificationAnswer(
    @RequestBody StudentCertificationAnswerDTO studentCertificationAnswerDTO){

    return studentCertificationAnswerUserCase.execute(studentCertificationAnswerDTO);
}
}