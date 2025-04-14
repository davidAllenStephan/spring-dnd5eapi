package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Dnd5eApiProficiency implements Serializable {
    private List<Dnd5eApiReference> classes;
    private String index;
    private String name;
    private List<Dnd5eApiReference> races;
    private Dnd5eApiReference reference;
    private String type;
    private String url;
    private String updated_at;
}
