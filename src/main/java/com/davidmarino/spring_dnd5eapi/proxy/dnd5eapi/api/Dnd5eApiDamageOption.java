package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.Optional;

@Data
public class Dnd5eApiDamageOption extends Dnd5eApiOption implements Serializable {
    private Dnd5eApiReference damage_type;
    private String damage_dice;
    private Optional<String> notes;
}
