package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi;

import com.davidmarino.TestConfig;
import com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api.Dnd5eApiNamedResourceList;
import com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api.Dnd5eApiSubclass;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@Import(TestConfig.class)
class Dnd5eApiSubclassTest {
    @Autowired
    private Dnd5eApiSubclasses dnd5eApiSubclasses;

    @Test
    public void whenGetSubclasses_success() {
        Dnd5eApiNamedResourceList result = dnd5eApiSubclasses.getSubclasses();
        System.out.println(result.getResults());
    }

    @Test
    public void whenGetSubclassByIndex_success() {
        Dnd5eApiSubclass dnd5eApiSubclass = dnd5eApiSubclasses.getSubclassByIndex("berserker");
        System.out.println(dnd5eApiSubclass);
    }

    @Test
    public void whenGetSubclassFeaturesByIndex_success() {
        Dnd5eApiNamedResourceList result = dnd5eApiSubclasses.getSubclassFeaturesByIndex("berserker");
        System.out.println(result.getResults());
    }

    @Test
    public void whenGetSubclassLevelFeaturesByIndex() {
        Dnd5eApiNamedResourceList result = dnd5eApiSubclasses.getSubclassLevelFeaturesByIndex("berserker", "3");
        System.out.println(result.getResults());
    }
}
