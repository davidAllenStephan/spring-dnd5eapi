package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Dnd5eApiNamedResourceList implements Serializable {
    private Integer count;
    private List<Dnd5eApiReference> results;
}
