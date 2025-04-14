package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi;

import com.davidmarino.TestConfig;
import com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api.Dnd5eApiNamedResourceList;
import com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api.Dnd5eApiProficiency;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@Import(TestConfig.class)
class Dnd5eApiProficiencyTest {
    @Autowired
    private Dnd5eApiProficiencies dnd5eApiProficiencies;

    @Test
    public void whenGetProficiencies_success() {
        Dnd5eApiNamedResourceList result = dnd5eApiProficiencies.getProficiencies();
    }

    @Test
    public void whenGetProficiencyByIndex_success() {
        Dnd5eApiProficiency dnd5eApiProficiency = dnd5eApiProficiencies.getProficiencyByIndex("all-armor");
    }
}
