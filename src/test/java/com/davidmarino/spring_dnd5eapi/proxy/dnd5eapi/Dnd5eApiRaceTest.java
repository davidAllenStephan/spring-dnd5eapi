package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi;

import com.davidmarino.TestConfig;
import com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api.Dnd5eApiNamedResourceList;
import com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api.Dnd5eApiRace;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@Import(TestConfig.class)
class Dnd5eApiRaceTest {
    @Autowired
    private Dnd5eApiRaces dnd5eApiRaces;

    @Test
    public void whenGetRaces_success() {
        Dnd5eApiNamedResourceList result = dnd5eApiRaces.getRaces();
        System.out.println(result.getResults());
    }

    @Test
    public void whenGetRaceByIndex_success() {
        Dnd5eApiRace result = dnd5eApiRaces.getRaceByIndex("dragonborn");
        System.out.println(result);
    }

    @Test
    public void whenGetRaceSubracesByIndex_success() {
        Dnd5eApiNamedResourceList result = dnd5eApiRaces.getRaceSubracesByIndex("dragonborn");
        System.out.println(result.getResults());
    }

    @Test
    public void whenGetRaceProficienciesByIndex_success() {
        Dnd5eApiNamedResourceList result = dnd5eApiRaces.getRaceProficienciesByIndex("dragonborn");
        System.out.println(result.getResults());
    }

    @Test
    public void whenGetRaceTraitsByIndex_success() {
        Dnd5eApiNamedResourceList result = dnd5eApiRaces.getRaceTraitsByIndex("dragonborn");
        System.out.println(result.getResults());
    }
}
