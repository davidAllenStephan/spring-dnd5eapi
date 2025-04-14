package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class Dnd5eApiDifficultyClass implements Serializable {
    private Dnd5eApiReference dc_type;
    private Integer dc_value;
    private String success_type;
}
