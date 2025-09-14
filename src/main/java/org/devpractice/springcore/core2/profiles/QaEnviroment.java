package org.devpractice.springcore.core2.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("qa")
public class QaEnviroment implements EnviromentalService{
    public String getEnviroment(){
        return "QA Enviroment";
    }
}
