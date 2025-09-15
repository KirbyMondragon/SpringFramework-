package org.devpractice.springcore.demo.infrastructure.adapters.input.implementation;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.devpractice.springcore.demo.application.port.input.GetCharacterUseCase;
import org.devpractice.springcore.demo.application.port.output.GetCharacterRemoteQueryPort;
import org.devpractice.springcore.demo.domain.model.CharacterAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GetCharacterImpl implements GetCharacterUseCase {

    @Autowired
    private GetCharacterRemoteQueryPort getCharacterRemoteQueryPort;

    @Override
    public CharacterAPI getCharacterUseCase(long id){
        return getCharacterRemoteQueryPort.execute(id);
    }
}