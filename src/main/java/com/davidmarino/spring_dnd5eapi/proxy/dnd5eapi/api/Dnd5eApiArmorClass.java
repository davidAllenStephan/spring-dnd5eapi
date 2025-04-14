package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.Optional;

@Data
public class Dnd5eApiArmorClass implements Serializable {
    private Integer base;
    private Boolean dex_bonus;
    private Optional<Integer> max_bonus;
}
