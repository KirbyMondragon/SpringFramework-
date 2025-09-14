package org.devpractice.springcore.demo.toDelete.controller;

import org.devpractice.springcore.demo.toDelete.controller.service.library.GetBookUseCase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Books")
public class BookController {

    private GetBookUseCase getBookUseCase;

    public BookController(GetBookUseCase getBookUseCase){
        this.getBookUseCase = getBookUseCase;
    }

    @GetMapping
    public String getBook() {
        return getBookUseCase.execute();
    }
}
