package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.Optional;

@Data
public class Dnd5eApiDC implements Serializable {
    private String dc_success;
    private Dnd5eApiReference dc_type;
    private Optional<String> desc;
}
