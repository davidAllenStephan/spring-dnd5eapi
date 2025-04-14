package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Dnd5eApiSpellCastingRef implements Serializable {
    private Integer level;
    private Dnd5eApiSpellCasting spellcasting_ability;
    private List<Dnd5eApiSpellCastingInfo> info;
}
