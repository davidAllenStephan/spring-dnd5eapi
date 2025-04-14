package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi;

import com.davidmarino.TestConfig;
import com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api.Dnd5eApiNamedResourceList;
import com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api.Dnd5eApiRule;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@Import(TestConfig.class)
class Dnd5eApiRuleTest {
    @Autowired
    private Dnd5eApiRules dnd5eApiRules;

    @Test
    public void whenGetRules_success() {
        Dnd5eApiNamedResourceList result = dnd5eApiRules.getRules();
    }

    @Test
    public void whenGetRuleByIndex_success() {
        Dnd5eApiRule dnd5eApiRule = dnd5eApiRules.getRuleByIndex("adventuring");
    }
}
