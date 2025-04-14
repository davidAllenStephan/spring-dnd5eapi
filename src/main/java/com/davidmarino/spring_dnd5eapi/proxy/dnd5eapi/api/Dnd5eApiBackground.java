package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Dnd5eApiBackground implements Serializable {
    private String index;
    private String name;
    private List<Dnd5eApiReference> starting_proficiencies;
    private Dnd5eApiChoice language_options;
    private String url;
    private List<Dnd5eApiEquipmentRef> starting_equipment;
    private List<Dnd5eApiChoice> starting_equipment_options;
    private Dnd5eApiFeature feature;
    private Dnd5eApiChoice personality_traits;
    private Dnd5eApiChoice ideals;
    private Dnd5eApiChoice bonds;
    private Dnd5eApiChoice flaws;
    private String updated_at;
}
