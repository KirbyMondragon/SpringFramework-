package org.devpractice.springcore.demo.toDelete.controller.service.university;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("Production")
public class Production implements GetStudentsUseCase {

    @Override
    public String execute(){
        return "Hi from production";
    }
}
