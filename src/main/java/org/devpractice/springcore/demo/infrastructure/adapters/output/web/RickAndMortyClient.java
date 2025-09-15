package org.devpractice.springcore.demo.infrastructure.adapters.output.web;

import org.devpractice.springcore.demo.infrastructure.adapters.output.dto.CharacterDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient( name = "rickAndMortyClient" , url = "https://rickandmortyapi.com/api")
public interface RickAndMortyClient {

    @GetMapping("/character/{id}")
    CharacterDTO getCharacter(@PathVariable("id") long id);
}
