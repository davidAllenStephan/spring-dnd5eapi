package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/*
DamageSchema
DCSchema
 */

@Data
public class Dnd5eApiSpell implements Serializable {
    private Dnd5eApiAreaOfEffect area_of_effect;
    private String attack_type;
    private String casting_time;
    private List<Dnd5eApiReference> classes;
    private List<String> components;
    private Boolean concentration;
    private Dnd5eApiDamage damage;
    private Dnd5eApiDC dc;
    private List<String> desc;
    private String duration;
    private Object heal_at_slot_level;
    private List<String> higher_level;
    private String index;
    private Integer level;
    private String material;
    private String name;
    private String range;
    private Boolean ritual;
    private Dnd5eApiReference school;
    private List<Dnd5eApiReference> subclasses;
    private String url;
    private String updated_at;
}
