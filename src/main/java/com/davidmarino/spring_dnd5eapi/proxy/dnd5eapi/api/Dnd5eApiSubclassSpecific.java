package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class Dnd5eApiSubclassSpecific implements Serializable {
    private Integer additional_magical_secrets_max_lvl;
    private Integer aura_range;
}
