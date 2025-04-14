package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@Data
public class Dnd5eApiEquipment implements Serializable {
    private String armor_category;
    private Dnd5eApiArmorClass armor_class;
    private String capacity;
    private String category_range;
    private List<Dnd5eApiContent> contents;
    private Dnd5eApiCost cost;
    private Dnd5eApiDamage damage;
    private List<String> desc;
    private Dnd5eApiReference equipment_category;
    private Dnd5eApiReference gear_category;
    private String index;
    private String name;
    private List<Dnd5eApiReference> properties;
    private Integer quantity;
    private Dnd5eApiRange range;
    private List<String> special;
    private Dnd5eApiSpeed speed;
    private Boolean stealth_disadvantage;
    private Integer str_minimum;
    private Dnd5eApiThrowRange throw_range;
    private String tool_category;
    private Dnd5eApiTwoHandedDamage two_handed_damage;
    private String url;
    private String vehicle_category;
    private String weapon_category;
    private String weapon_range;
    private Integer weight;
    private String updated_at;
}
