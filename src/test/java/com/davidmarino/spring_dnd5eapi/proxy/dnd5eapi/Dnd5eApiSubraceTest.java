package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi;

import com.davidmarino.TestConfig;
import com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api.Dnd5eApiNamedResourceList;
import com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api.Dnd5eApiSubrace;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@Import(TestConfig.class)
class Dnd5eApiSubraceTest {
    @Autowired
    private Dnd5eApiSubraces dnd5eApiSubraces;

    @Test
    public void whenGetSubraces_success() {
        Dnd5eApiNamedResourceList result = dnd5eApiSubraces.getSubraces();
        System.out.println(result.getResults());
    }

    @Test
    public void whenGetSubraceByIndex_success() {
        Dnd5eApiSubrace dnd5eApiSubrace = dnd5eApiSubraces.getSubraceByIndex("high-elf");
        System.out.println(dnd5eApiSubrace);
    }

    @Test
    public void whenGetSubraceTraitsByIndex_success() {
        Dnd5eApiNamedResourceList result = dnd5eApiSubraces.GetSubraceTraitsByIndex("high-elf");
        System.out.println(result.getResults());
    }

    @Test
    public void whenGetSubraceProficienciesByIndex() {
        Dnd5eApiNamedResourceList result = dnd5eApiSubraces.GetSubraceProficienciesByIndex("high-elf");
        System.out.println(result.getResults());
    }
}
