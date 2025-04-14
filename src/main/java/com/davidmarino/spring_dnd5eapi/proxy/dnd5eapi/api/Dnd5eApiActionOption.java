package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class Dnd5eApiActionOption extends Dnd5eApiOption implements Serializable {
    enum ActionOptionType {
        MELEE,
        RANGED,
        ABILITY,
        MAGIC
    }
    private String action_name;
    private String count;
    private ActionOptionType type;
    private String notes;
}
