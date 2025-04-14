package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api;


import lombok.Data;

import java.io.Serializable;

@Data
public class Dnd5eApiAreaOfEffect implements Serializable {
    enum AreaOfEffectType {
        SPHERE,
        CUBE,
        CYLINDER,
        LINE,
        CONE
    }
    private String _id;
    private Integer size;
    private AreaOfEffectType type;
}
