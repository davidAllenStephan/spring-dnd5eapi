package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi;

import com.davidmarino.TestConfig;
import com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api.Dnd5eApiNamedResourceList;
import com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api.Dnd5eApiRuleSection;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@Import(TestConfig.class)
class Dnd5eApiRuleSectionTest {
    @Autowired
    private Dnd5eApiRuleSections dnd5eApiRuleSections;

    @Test
    public void whenGetRuleSections_success() {
        Dnd5eApiNamedResourceList result = dnd5eApiRuleSections.getRuleSections();
    }

    @Test
    public void whenGetRuleSectionByIndex_success() {
        Dnd5eApiRuleSection result = dnd5eApiRuleSections.getRuleSectionByIndex("ability-checks");
    }
}
