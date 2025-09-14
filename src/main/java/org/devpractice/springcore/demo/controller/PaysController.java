package org.devpractice.springcore.demo.controller;

import org.devpractice.springcore.demo.service.Process;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PaysController {
    private Process process;

    @Autowired
    public PaysController(@Qualifier("CleanPay") Process process){
        this.process = process;
    }

    @GetMapping()
    public String paying(){
        return process.confirmProcess();
    }
}
