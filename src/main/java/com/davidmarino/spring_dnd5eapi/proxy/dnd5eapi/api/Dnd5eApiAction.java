package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Dnd5eApiAction implements Serializable {
    private String name;
    private String desc;
    private Dnd5eApiUsage usage;
    private Dnd5eApiDifficultyClass dc;
    private List<Dnd5eApiActionDamage> damage;
    private Dnd5eApiAreaOfEffect area_of_effect;
}
