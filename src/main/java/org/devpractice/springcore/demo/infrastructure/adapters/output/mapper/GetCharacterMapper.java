package org.devpractice.springcore.demo.infrastructure.adapters.output.mapper;

import org.devpractice.springcore.demo.domain.model.CharacterAPI;
import org.devpractice.springcore.demo.infrastructure.adapters.output.dto.CharacterDTO;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class GetCharacterMapper {
    public CharacterAPI toDomain(CharacterDTO dto){

        return CharacterAPI.builder()
                .id(dto.id())
                .name(dto.name())
                .status(dto.status())
                .species(dto.species())
                .type(dto.type())
                .gender(dto.gender())
                .origin(dto.origin())
                .location(dto.location())
                .image(dto.image())
                .episode(dto.episode())
                .url(dto.url())
                .created(dto.created())
                .build();

    }
}

