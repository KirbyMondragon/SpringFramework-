package org.devpractice.springcore.core2.profiles;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profiles")
public class profilesController {
    private final EnviromentalService enviromentalService;
    public profilesController(EnviromentalService enviromentalService){
        this.enviromentalService = enviromentalService;
    }

    @GetMapping()
    public String checkStatus(){
        return enviromentalService.getEnviroment();
    }
}
