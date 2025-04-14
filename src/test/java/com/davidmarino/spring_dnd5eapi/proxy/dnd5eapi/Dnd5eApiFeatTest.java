package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi;

import com.davidmarino.TestConfig;
import com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api.Dnd5eApiFeat;
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
class Dnd5eApiFeatTest {
    @Autowired
    private Dnd5eApiFeats dnd5eApiFeats;

    @Test
    public void whenGetFeats_success() {
        Dnd5eApiNamedResourceList result = dnd5eApiFeats.getFeats();
    }

    @Test
    public void whenGetFeatByIndex_success() {
        Dnd5eApiFeat result = dnd5eApiFeats.getFeatByIndex("grappler");
    }
}
