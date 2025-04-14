package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class Dnd5eApiEquipmentRef implements Serializable {
    private Dnd5eApiReference equipment;
    private Integer quantity;
}
