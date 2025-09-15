package org.devpractice.springcore.demo.application.port.output;

import org.devpractice.springcore.demo.domain.model.CharacterAPI;

public interface GetCharacterRemoteQueryPort {
    CharacterAPI execute(long id);
}
