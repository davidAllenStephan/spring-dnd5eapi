package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Dnd5eApiMultiClassing implements Serializable {
    private String _id;
    private List<Dnd5eMultiClassingPrereq> prerequisites;
    private Dnd5eApiChoice prerequisite_options;
    private List<Dnd5eApiReference> proficiencies;
    private List<Dnd5eApiChoice> proficiency_choices;
}
