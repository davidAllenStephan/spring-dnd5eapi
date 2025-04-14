package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi;

import com.davidmarino.TestConfig;
import com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api.Dnd5eApiNamedResourceList;
import com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api.Dnd5eApiBackground;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@Import(TestConfig.class)
class Dnd5eApiBackgroundTest {
    @Autowired
    private Dnd5eApiBackgrounds dnd5eApiBackgrounds;

    @Test
    public void whenGetBackgrounds_success() {
        Dnd5eApiNamedResourceList result = dnd5eApiBackgrounds.getBackgrounds();
        System.out.println(result.getResults());
    }

    @Test
    public void whenGetBackgroundByIndex_success() {
        Dnd5eApiBackground dnd5eApiBackground = dnd5eApiBackgrounds.getBackgroundByIndex("acolyte");
        System.out.println(dnd5eApiBackground);
    }
}
