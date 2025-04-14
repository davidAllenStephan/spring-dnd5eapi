package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Dnd5eApiTrait implements Serializable {
    private List<String> desc;
    private String index;
    private String name;
    private List<Dnd5eApiProficiency> proficiencies;
    private Dnd5eApiChoice proficiency_choices;
    private Dnd5eApiChoice language_options;
    private List<Dnd5eApiReference> races;
    private List<Dnd5eApiReference> subraces;
    private Dnd5eApiReference parent;
    private Dnd5eApiTraitSpecific trait_specific;
    private String url;
    private String updated_at;
}
