package com.implement.security.service;

import com.implement.security.webclient.dto.PokemonWebClientDTO;
import com.implement.security.webclient.impl.WebClientImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class PokemonService {

    @Autowired
    WebClientImpl webClient;

    public Mono<Mono<PokemonWebClientDTO>> getByName(String name) {
        return webClient.getPokemon(name).map(resp -> {
            resp.setName(resp.getName());
            resp.setBaseExperience(resp.getBaseExperience());

            return Mono.just(resp);
        });
    }

}
