package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Dnd5eApiIdealOption extends Dnd5eApiOption implements Serializable {
    private String desc;
    private List<Dnd5eApiReference> alignments;
}
