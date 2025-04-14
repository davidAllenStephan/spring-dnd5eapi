package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class Dnd5eApiReaction implements Serializable {
    private String name;
    private String desc;
    private Dnd5eApiDifficultyClass dc;
}
