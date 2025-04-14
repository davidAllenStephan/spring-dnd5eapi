package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Dnd5eApiMagicItem implements Serializable {
    private String _id;
    private List<String> desc;
    private Dnd5eApiReference equipment_category;
    private String image;
    private String index;
    private String name;
    private Dnd5eApiRarity rarity;
    private String url;
    private List<Dnd5eApiReference> variants;
    private Boolean variant;
    private String updated_at;
}
