package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class Dnd5eApiSpeed implements Serializable {
    @JsonProperty("long")
    private Integer _long;
    private String unit;
}
