package com.implement.security.webclient.dto;

import com.implement.security.dto.AbilityDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PokemonWebClientDTO {
    private String name;
    private AbilityDTO ability;
    private Long baseExperience;
}
