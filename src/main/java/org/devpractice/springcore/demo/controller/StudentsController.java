package org.devpractice.springcore.demo.controller;

import org.devpractice.springcore.demo.service.university.GetStudentsUseCase;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentsController {
    private GetStudentsUseCase getStudentsUseCase ;

    public StudentsController(@Qualifier("Production") GetStudentsUseCase getStudentsUseCase) {
        this.getStudentsUseCase = getStudentsUseCase;
    }

    @GetMapping()
    public String getStudents(){
        return getStudentsUseCase.execute();
    }


}
