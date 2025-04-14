package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Dnd5eApiSubrace implements Serializable {
    private List<Dnd5eApiAbilityBonus> ability_bonuses;
    private String index;
    private Dnd5eApiChoice language_options;
    private String name;
    private Dnd5eApiReference race;
    private List<Dnd5eApiReference> racial_traits;
    private List<Dnd5eApiReference> starting_proficiencies;
    private String url;
    private String updated_at;
}
