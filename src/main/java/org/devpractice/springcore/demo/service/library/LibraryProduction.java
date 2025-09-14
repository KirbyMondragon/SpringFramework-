package org.devpractice.springcore.demo.service.library;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("production")
public class LibraryProduction implements GetBookUseCase{
    @Override
    public String execute(){
        return "Library to production";
    }
}
