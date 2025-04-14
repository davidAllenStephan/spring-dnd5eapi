package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Dnd5eApiRace implements Serializable {
    private Dnd5eApiChoice ability_bonus_options;
    private List<Dnd5eApiRaceAbilityBonus> ability_bonuses;
    private String age;
    private String alignment;
    private String index;
    private String language_desc;
    private Dnd5eApiChoice language_options;
    private List<Dnd5eApiReference> languages;
    private String name;
    private String size;
    private String size_description;
    private Integer speed;
    private List<Dnd5eApiReference> starting_proficiencies;
    private Dnd5eApiChoice starting_proficiency_options;
    private List<Dnd5eApiReference> subraces;
    private List<Dnd5eApiReference> traits;
    private String url;
    private String updated_at;
}
