package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api;

import lombok.Data;

import java.util.List;

@Data
public class Dnd5eApiMultipleOption extends Dnd5eApiOption {
    private List<Dnd5eApiOption> items;
}
