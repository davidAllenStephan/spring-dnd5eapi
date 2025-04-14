package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.Optional;

@Data
public class Dnd5eApiTraitSpecific implements Serializable {
    private Optional<Dnd5eApiChoice> choice;
    private Optional<Dnd5eApiChoice> spell_options;
    private Optional<Dnd5eApiReference> damage_type;
    private Optional<Dnd5eApiAction> breath_weapon;
}
