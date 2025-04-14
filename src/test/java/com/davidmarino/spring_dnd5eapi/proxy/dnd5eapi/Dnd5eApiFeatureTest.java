package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi;

import com.davidmarino.TestConfig;
import com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api.Dnd5eApiFeature;
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
class Dnd5eApiFeatureTest {
    @Autowired
    private Dnd5eApiFeatures dnd5eApiFeatures;

    @Test
    public void whenGetFeatures_success() {
        Dnd5eApiNamedResourceList result = dnd5eApiFeatures.getFeatures();
        System.out.println(result.getResults());
    }

    @Test
    public void whenGetFeatureByIndex_success() {
        Dnd5eApiFeature result = dnd5eApiFeatures.getFeatureByIndex("action-surge-1-use");
        System.out.println(result);
    }
}
