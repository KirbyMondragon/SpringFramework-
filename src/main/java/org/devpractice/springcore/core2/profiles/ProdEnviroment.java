package org.devpractice.springcore.core2.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class ProdEnviroment implements EnviromentalService{
    public String getEnviroment(){
        return "Production Enviroment";
    }
}
