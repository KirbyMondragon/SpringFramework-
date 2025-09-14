package org.devpractice.springcore.demo.toDelete.controller.service;

import org.springframework.stereotype.Service;

@Service
public class StripePay implements Process {
    public String confirmProcess(){
        return  "Your StripePay is in process";
    }
}
