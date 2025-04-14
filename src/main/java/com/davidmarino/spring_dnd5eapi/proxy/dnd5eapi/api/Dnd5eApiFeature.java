package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Dnd5eApiFeature implements Serializable {
    private String name;
    private List<String> desc;
    @JsonProperty("class")
    private Dnd5eApiClass _class;
    private Integer level;
    private List<Dnd5eApiPrerequisite> prerequisites;
    private String url;
    private String updated_at;
}
