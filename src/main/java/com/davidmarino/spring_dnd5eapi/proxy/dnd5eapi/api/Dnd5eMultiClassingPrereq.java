package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class Dnd5eMultiClassingPrereq implements Serializable {
    private String _id;
    private Dnd5eApiReference ability_score;
    private Integer minimum_score;
}
