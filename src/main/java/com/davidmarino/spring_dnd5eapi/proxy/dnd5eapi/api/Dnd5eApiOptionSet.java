package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Dnd5eApiOptionSet implements Serializable {
    private String _id;
    private String option_set_type;
    private List<Dnd5eApiOption> options;
}
