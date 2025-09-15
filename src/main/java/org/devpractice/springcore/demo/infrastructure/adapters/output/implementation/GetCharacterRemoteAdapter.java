package org.devpractice.springcore.demo.infrastructure.adapters.output.implementation;

import feign.FeignException;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.devpractice.springcore.demo.application.port.output.GetCharacterRemoteQueryPort;
import org.devpractice.springcore.demo.domain.model.CharacterAPI;
import org.devpractice.springcore.demo.infrastructure.adapters.output.dto.CharacterDTO;
import org.devpractice.springcore.demo.infrastructure.adapters.output.mapper.GetCharacterMapper;
import org.devpractice.springcore.demo.infrastructure.adapters.output.web.RickAndMortyClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@RequiredArgsConstructor
public class GetCharacterRemoteAdapter implements GetCharacterRemoteQueryPort {
    private final RickAndMortyClient client;
    private final GetCharacterMapper mapper = new GetCharacterMapper();

    @Override
    public CharacterAPI execute(long id) {
        try {
            CharacterDTO response = client.getCharacter(id);
            if (response == null) {
                return null;
            }
            return mapper.toDomain(response);
        } catch (FeignException.NotFound e) {
            return null;
        } catch (Exception e) {
            throw new RuntimeException("Error fetching character with ID: " + id, e);
        }
    }
}
