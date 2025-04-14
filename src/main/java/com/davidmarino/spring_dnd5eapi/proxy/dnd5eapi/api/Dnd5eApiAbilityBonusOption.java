package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class Dnd5eApiAbilityBonusOption extends Dnd5eApiOption implements Serializable {
    private Dnd5eApiReference ability_score;
    private Integer bonus;
}
