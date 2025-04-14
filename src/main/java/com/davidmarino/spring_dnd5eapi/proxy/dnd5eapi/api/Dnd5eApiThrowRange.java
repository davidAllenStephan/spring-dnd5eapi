package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class Dnd5eApiThrowRange implements Serializable {
    private Integer _long;
    private Integer normal;
}
