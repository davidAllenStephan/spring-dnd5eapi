package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class Dnd5eApiContent implements Serializable {
    private Dnd5eApiReference item;
    private Integer quantity;
}
