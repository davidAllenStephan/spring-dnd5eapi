package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@Data
public class Dnd5eApiBreathOption extends Dnd5eApiOption implements Serializable {
    private String name;
    private Dnd5eApiDifficultyClass dc;
    private List<Optional<Dnd5eApiDamage>> damage;
}
