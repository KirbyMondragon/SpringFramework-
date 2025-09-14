package org.devpractice.springcore.core2.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class DevEnviroment implements EnviromentalService{
    public String getEnviroment(){
        return "Develoment Enviroment";
    }
}
