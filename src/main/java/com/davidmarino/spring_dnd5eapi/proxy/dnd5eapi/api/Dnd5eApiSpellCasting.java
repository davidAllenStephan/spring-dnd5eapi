package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class Dnd5eApiSpellCasting implements Serializable {
    private Integer cantrips_known;
    private Integer spell_slots_level_1;
    private Integer spell_slots_level_2;
    private Integer spell_slots_level_3;
    private Integer spell_slots_level_4;
    private Integer spell_slots_level_5;
    private Integer spell_slots_level_6;
    private Integer spell_slots_level_7;
    private Integer spell_slots_level_8;
    private Integer spell_slots_level_9;
    private Integer spells_known;
}
