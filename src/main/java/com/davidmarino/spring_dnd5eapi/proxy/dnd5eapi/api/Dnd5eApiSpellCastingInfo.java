package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Dnd5eApiSpellCastingInfo implements Serializable {
    private List<String> desc;
    private String name;
}
