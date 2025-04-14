package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi;

import com.davidmarino.TestConfig;
import com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api.Dnd5eApiNamedResourceList;
import com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api.Dnd5eApiMonster;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@Import(TestConfig.class)
class Dnd5eApiMonsterTest {
    @Autowired
    private Dnd5eApiMonsters dnd5eApiMonsters;

    @Test
    public void whenGetMonsters_success() {
        Dnd5eApiNamedResourceList result = dnd5eApiMonsters.getMonsters();
        System.out.println(result.getResults());
    }

    @Test
    public void whenGetMonsterByIndex_success() {
        Dnd5eApiMonster dnd5eApiMonster = dnd5eApiMonsters.getMonsterByIndex("aboleth");
        System.out.println(dnd5eApiMonster);
    }
}
