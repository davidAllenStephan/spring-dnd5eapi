package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class Dnd5eApiSense implements Serializable {
    private String blindsight;
    private String darkvision;
    private Integer passive_perception;
    private String tremorsense;
    private String truesight;
}
