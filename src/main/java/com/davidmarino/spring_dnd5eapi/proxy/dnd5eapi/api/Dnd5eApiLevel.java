package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Dnd5eApiLevel implements Serializable {
    private Integer ability_score_bonuses;
    @JsonProperty("class")
    private Dnd5eApiReference _class;
    private Dnd5eApiClassSpecific class_specific;
    private List<Dnd5eApiReference> features;
    private String index;
    private Integer level;
    private Integer prof_bonus;
    private Dnd5eApiSpellCasting spellcasting;
    private Dnd5eApiReference subclass;
    private Dnd5eApiSubclassSpecific subclass_specific;
    private String url;
    private String updated_at;
}
