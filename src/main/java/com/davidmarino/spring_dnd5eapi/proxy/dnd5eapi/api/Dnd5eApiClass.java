package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Dnd5eApiClass implements Serializable {
    private String _id;
    private String class_levels;
    private Dnd5eApiMultiClassing multi_classing;
    private String hit_die;
    private String index;
    private String name;
    private List<Dnd5eApiReference> proficiencies;
    private List<Dnd5eApiChoice> proficiency_choices;
    private List<Dnd5eApiReference> saving_throws;
    private Dnd5eApiSpellCasting spellcasting;
    private String spells;
    private List<Dnd5eApiEquipmentRef> starting_equipment;
    private List<Dnd5eApiChoice> starting_equipment_options;
    private List<Dnd5eApiReference> subclasses;
    private String url;
    private String updated_at;
}
