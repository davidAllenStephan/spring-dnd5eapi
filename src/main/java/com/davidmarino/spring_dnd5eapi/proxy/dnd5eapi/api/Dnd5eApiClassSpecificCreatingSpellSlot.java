package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class Dnd5eApiClassSpecificCreatingSpellSlot implements Serializable {
    private Integer sorcery_point_cost;
    private Integer spell_slow_level;
}
