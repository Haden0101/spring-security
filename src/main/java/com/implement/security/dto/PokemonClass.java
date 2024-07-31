package com.implement.security.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PokemonClass {

    private String name;
    private AbilityDTO ability;
    private Long baseExperience;


}
