package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi;

import com.davidmarino.TestConfig;
import com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@Import(TestConfig.class)
class Dnd5eApiClassTest{
    @Autowired
    private Dnd5eApiClasses dnd5eApiClasses;

    @Test
    public void whenGetClasses_success() {
        Dnd5eApiNamedResourceList result = dnd5eApiClasses.getClasses();
        System.out.println(result.getResults());
    }

    @Test
    public void whenGetClassByIndex_success() {
        Dnd5eApiClass dnd5eApiClass = dnd5eApiClasses.getClassByIndex("bard");
        System.out.println(dnd5eApiClass);
    }

    @Test
    public void whenGetClassSubclasses_success() {
        Dnd5eApiNamedResourceList result = dnd5eApiClasses.getClassSubclassesByIndex("bard");
        System.out.println(result);
    }

    @Test
    public void whenGetClassStartingEquipment_success() {
        Dnd5eApiStartingEquipment result = dnd5eApiClasses.getClassStartingEquipmentByIndex("bard");
        System.out.println(result);
    }

    @Test
    public void whenGetClassSpellcasting_success() {
        Dnd5eApiSpellCastingRef result = dnd5eApiClasses.getClassSpellcastingByIndex("bard");
        System.out.println(result);
    }

    @Test
    public void whenGetClassSpells_success() {
        Dnd5eApiNamedResourceList result = dnd5eApiClasses.getClassSpellsByIndex("bard");
        System.out.println(result);
    }

    @Test
    public void whenGetClassFeatures_success() {
        Dnd5eApiNamedResourceList result = dnd5eApiClasses.getClassFeaturesByIndex("bard");
        System.out.println(result);
    }

    @Test
    public void whenGetClassProficiencies_success() {
        Dnd5eApiNamedResourceList result = dnd5eApiClasses.getClassProficienciesByIndex("bard");
        System.out.println(result);
    }

    @Test
    public void whenGetClassMulticlassing_success() {
        Dnd5eApiMultiClassing result = dnd5eApiClasses.getClassMulticlassingByIndex("bard");
        System.out.println(result);
    }

    @Test
    public void whenGetClassLevels_success() {
        List<Dnd5eApiLevel> result = dnd5eApiClasses.getClassLevelsByIndex("bard");
        System.out.println(result);
    }

    @Test
    public void whenGetClassLevel_success() {
        Dnd5eApiLevel result = dnd5eApiClasses.getClassLevelByIndexAndLevel("bard", 3);
        System.out.println(result);
    }

    @Test
    public void whenGetClassSpellsByLevel_success() {
        Dnd5eApiNamedResourceList result = dnd5eApiClasses.getClassSpellsByIndexAndLevel("bard", 3);
        System.out.println(result);
    }

    @Test
    public void whenGetClassFeaturesByLevel_success() {
        Dnd5eApiNamedResourceList result = dnd5eApiClasses.getClassFeaturesByIndexAndLevel("bard", 3);
        System.out.println(result);
    }
}
