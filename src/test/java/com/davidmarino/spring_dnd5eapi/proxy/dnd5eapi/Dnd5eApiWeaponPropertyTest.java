package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi;

import com.davidmarino.TestConfig;
import com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api.Dnd5eApiNamedResourceList;
import com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api.Dnd5eApiWeaponProperty;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@Import(TestConfig.class)
class Dnd5eApiWeaponPropertyTest {
    @Autowired
    private Dnd5eApiWeaponProperties dnd5eApiWeaponProperties;

    @Test
    public void whenGetWeaponProperties_success() {
        Dnd5eApiNamedResourceList result = dnd5eApiWeaponProperties.getWeaponProperties();
    }

    @Test
    public void whenGetWeaponPropertyByIndex_success() {
        Dnd5eApiWeaponProperty dnd5eApiWeaponProperty = dnd5eApiWeaponProperties.getWeaponPropertyByIndex("ammunition");
    }
}
