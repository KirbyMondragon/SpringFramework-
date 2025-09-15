package org.devpractice.springcore.demo.infrastructure.adapters.input.web;

import org.devpractice.springcore.demo.application.port.input.GetCharacterUseCase;
import org.devpractice.springcore.demo.domain.model.CharacterAPI;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/character")
public class CharacterController {
    private final GetCharacterUseCase character;

    public CharacterController(GetCharacterUseCase characters) {
        this.character = characters;
    }

    @GetMapping("/{id}")
    public ResponseEntity<CharacterAPI> getCharacterById(@PathVariable Integer id) {
        try {
            CharacterAPI characterResponse = character.getCharacterUseCase(id);
            if (characterResponse == null) {
                return ResponseEntity.notFound().build();
            }
            return ResponseEntity.ok(characterResponse);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }
}
