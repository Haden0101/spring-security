package com.implement.security.controller;

import com.implement.security.service.PokemonService;
import com.implement.security.webclient.dto.PokemonWebClientDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/v1")
public class CustomenController {

    @Autowired
    PokemonService pokemonService;

    @GetMapping("/index")
    public String index() {
        return "Hello Word!";
    }

    @GetMapping("/index2")
    public String index2() {
        return "Hello Word not SECURITY";
    }

    @GetMapping("/find/{name}")
    public Mono<Mono<PokemonWebClientDTO>> getAllPokemon(@PathVariable("name") String name) {
        return pokemonService.getByName(name);
    }

}
