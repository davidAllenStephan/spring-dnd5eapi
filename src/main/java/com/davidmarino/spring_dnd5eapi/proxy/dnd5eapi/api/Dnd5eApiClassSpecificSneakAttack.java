package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class Dnd5eApiClassSpecificSneakAttack implements Serializable {
    private Integer dice_count;
    private Integer dice_value;
}
