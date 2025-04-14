package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class Dnd5eApiTwoHandedDamage implements Serializable {
    private String damage_dice;
    private Dnd5eApiReference damage_type;
}
