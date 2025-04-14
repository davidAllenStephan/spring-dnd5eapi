package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Dnd5eApiSpecialAbilityUsage implements Serializable {
    private String type;
    private Integer times;
    private List<String> rest_types;
}
