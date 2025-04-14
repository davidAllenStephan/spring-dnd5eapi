package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Dnd5eApiSpecialAbilitySpellcasting implements Serializable {
    private Integer level;
    private Dnd5eApiReference ability;
    private Integer dc;
    private Integer modifier;
    private List<String> components_required;
    private String school;
    private Record slots;
    private List<Dnd5eApiSpecialAbilitySpell> spells;
}
