package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class Dnd5eApiRuleSection implements Serializable {
    private String desc;
    private String index;
    private String name;
    private String url;
    private String updated_at;
}
