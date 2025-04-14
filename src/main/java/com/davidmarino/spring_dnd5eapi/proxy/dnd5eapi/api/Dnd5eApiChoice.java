package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class Dnd5eApiChoice implements Serializable {
    private String _id;
    private String desc;
    private Integer choose;
    private String type;
    private Dnd5eApiOptionSet from;
}
