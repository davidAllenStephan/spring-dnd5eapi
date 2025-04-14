package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Dnd5eApiMonster implements Serializable {
    private String _id;
    private List<Dnd5eApiAction> actions;
    private String alignment;
    private List<Dnd5eApiArmorClass> armor_class;
    private Integer challenge_rating;
    private Integer charisma;
    private List<Dnd5eApiReference> condition_immunities;
    private Integer constitution;
    private List<String> damage_immunities;
    private List<String> damage_vulnerabilities;
    private Integer dexterity;
    private List<Dnd5eApiReference> forms;
    private String hit_dices;
    private Integer hit_points;
    private String hit_points_roll;
    private String image;
    private String index;
    private Integer intelligence;
    private String languages;
    private List<Dnd5eApiLegendaryAction> legendary_actions;
    private String name;
    private List<Dnd5eApiProficiency> proficiencies;
    private List<Dnd5eApiReaction> reactions;
    private Dnd5eApiSense senses;
    private String size;
    private List<Dnd5eApiSpecialAbility> special_abilities;
    private Dnd5eApiSpeed speed;
    private Integer strength;
    private String subtype;
    private String type;
    private String url;
    private Integer wisdom;
    private Integer xp;
    private String updated_at;
}
