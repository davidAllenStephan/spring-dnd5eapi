package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class Dnd5eApiCountedReferenceOption extends Dnd5eApiOption implements Serializable {
    private Integer count;
    private Dnd5eApiReference of;
    // type
    // prerequisites
}
