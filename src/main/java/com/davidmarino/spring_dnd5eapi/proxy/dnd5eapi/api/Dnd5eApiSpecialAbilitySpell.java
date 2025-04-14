package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class Dnd5eApiSpecialAbilitySpell implements Serializable {
    private String name;
    private Integer level;
    private String url;
    private String notes;
    private Dnd5eApiSpecialAbilityUsage usage;
}
