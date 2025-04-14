package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Dnd5eApiSpecialAbility implements Serializable {
    private String name;
    private String desc;
    private Integer attack_bonus;
    private List<Dnd5eApiDamage> damage;
    private Dnd5eApiDifficultyClass dc;
    private Dnd5eApiSpecialAbilitySpellcasting spellcasting;
    private Dnd5eApiSpecialAbilityUsage usage;
}
