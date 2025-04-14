package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class Dnd5eApiDamage implements Serializable {
    private Dnd5eApiReference damage_type;
    private String damage_dice;
}
