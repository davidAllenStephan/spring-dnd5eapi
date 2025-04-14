package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class Dnd5eApiRaceAbilityBonus implements Serializable {
    private Dnd5eApiAbilityScore ability_score;
    private Integer bonus;
}
