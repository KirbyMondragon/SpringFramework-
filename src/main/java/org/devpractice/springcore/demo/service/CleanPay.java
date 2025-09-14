package org.devpractice.springcore.demo.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Qualifier("CleanPay")
public class CleanPay implements Process {
    public String confirmProcess(){
        return "Clean Payment is with you";
    }
}
