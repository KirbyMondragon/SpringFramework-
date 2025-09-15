package org.devpractice.springcore.demo.infrastructure.adapters.input.web;

import lombok.RequiredArgsConstructor;
import org.devpractice.springcore.demo.application.port.input.GetCharacterUseCase;
import org.devpractice.springcore.demo.domain.model.CharacterAPI;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/character")
public class CharacterController {
    private final GetCharacterUseCase getCharacterUseCase;

    @GetMapping("/{id}")
    public ResponseEntity<CharacterAPI> getCharacterById(@PathVariable long id) {
        try {
            CharacterAPI characterResponse = getCharacterUseCase.getCharacterUseCase(id);
            if (characterResponse == null) {
                return ResponseEntity.notFound().build();
            }
            return ResponseEntity.ok(characterResponse);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }
}
