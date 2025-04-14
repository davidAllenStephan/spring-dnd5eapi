package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi;

import com.davidmarino.TestConfig;
import com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api.Dnd5eApiNamedResourceList;
import com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api.Dnd5eApiTrait;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@Import(TestConfig.class)
class Dnd5eApiTraitTest {
    @Autowired
    private Dnd5eApiTraits dnd5eApiTraits;

    @Test
    public void whenGetTraits_success() {
        Dnd5eApiNamedResourceList result = dnd5eApiTraits.getTraits();
        System.out.println(result.getResults());
    }

    @Test
    public void whenGetTraitByIndex_success() {
        Dnd5eApiTrait dnd5eApiTrait = dnd5eApiTraits.getTraitByIndex("brave");
        System.out.println(dnd5eApiTrait);
    }
}
