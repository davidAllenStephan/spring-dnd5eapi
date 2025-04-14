package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi;

import com.davidmarino.TestConfig;
import com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api.Dnd5eApiNamedResourceList;
import com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api.Dnd5eApiSpell;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@Import(TestConfig.class)
class Dnd5eApiSpellTest {
    @Autowired
    private Dnd5eApiSpells dnd5eApiSpells;

    @Test
    public void whenGetSpells_success() {
        Dnd5eApiNamedResourceList result = dnd5eApiSpells.getSpells();
    }

    @Test
    public void whenGetSpellByIndex_success() {
        Dnd5eApiSpell dnd5eApiSpell = dnd5eApiSpells.getSpellByIndex("acid-arrow");
    }
}
