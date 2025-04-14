package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi;

import com.davidmarino.TestConfig;
import com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api.Dnd5eApiCondition;
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
class Dnd5eApiConditionTest {
    @Autowired
    private Dnd5eApiConditions dnd5eApiConditions;

    @Test
    public void whenGetConditions_success() {
        Dnd5eApiNamedResourceList result = dnd5eApiConditions.getConditions();
        System.out.println(result.getResults());
    }

    @Test
    public void whenGetConditionByIndex_success() {
        Dnd5eApiCondition dnd5eApiCondition = dnd5eApiConditions.getConditionByIndex("blinded");
        System.out.println(dnd5eApiCondition);
    }
}
