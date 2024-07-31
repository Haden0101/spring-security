package com.implement.security.webclient.impl;

import com.implement.security.webclient.dto.PokemonWebClientDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class WebClientImpl {


    private final WebClient webClient;

    @Autowired
    public WebClientImpl(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.build();
    }

    public Mono<PokemonWebClientDTO> getPokemon(@PathVariable("name") String name){
        return webClient.get()
                .uri("/pokemon/{name}", name)
                .retrieve()
                .bodyToMono(PokemonWebClientDTO.class);
    }

}
