package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Dnd5eApiFeat implements Serializable {
    private String index;
    private String name;
    private List<Dnd5eApiPrerequisite> prerequisites;
    private List<String> desc;
    private String url;
    private String updated_at;
}
