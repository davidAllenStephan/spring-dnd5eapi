package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi;

import com.davidmarino.TestConfig;
import com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api.Dnd5eApiAbilityScore;
import com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api.Dnd5eApiNamedResourceList;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@Import(TestConfig.class)
class Dnd5eApiAbilityScoreTest {
    @Autowired
    private Dnd5eApiAbilityScores dnd5eApiAbilityScores;

    @Test
    public void whenGetAbilityScores_success() {
        Dnd5eApiNamedResourceList result = dnd5eApiAbilityScores.getAbilityScores();
    }

    @Test
    public void whenGetAbilityScoreByIndex_success() {
        Dnd5eApiAbilityScore dnd5eApiAbilityScore = dnd5eApiAbilityScores.getAbilityScoreByIndex("int");
    }
}
