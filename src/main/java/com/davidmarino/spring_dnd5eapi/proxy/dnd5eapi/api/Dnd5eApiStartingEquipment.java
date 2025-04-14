package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Dnd5eApiStartingEquipment implements Serializable {
    private List<Dnd5eApiEquipmentRef> starting_equipment;
}
