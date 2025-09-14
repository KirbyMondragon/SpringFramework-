package org.devpractice.springcore.demo.service.library;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("development")
public class Librarydevelopment implements GetBookUseCase{

    @Override
    public String execute(){
        return "Library to development";
    }


}
