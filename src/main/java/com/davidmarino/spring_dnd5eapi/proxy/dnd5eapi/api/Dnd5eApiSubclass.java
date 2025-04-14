package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Dnd5eApiSubclass implements Serializable {
    private Dnd5eApiReference _class;
    private List<String> desc;
    private String index;
    private String name;
    private List<Dnd5eApiSpell> spells;
    private String subclass_flavor;
    private String subclass_levels;
    private String url;
    private String updated_at;
}
