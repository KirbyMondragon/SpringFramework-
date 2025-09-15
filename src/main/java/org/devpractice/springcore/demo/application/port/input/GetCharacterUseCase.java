package org.devpractice.springcore.demo.application.port.input;

import org.devpractice.springcore.demo.domain.model.CharacterAPI;

public interface GetCharacterUseCase {
    CharacterAPI getCharacterUseCase(long id);
}
