package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;

@Data
public class Dnd5eApiReference implements Serializable {
    private String _id;
    private String index;
    private String name;
    private Integer level;
    private String url;
}
