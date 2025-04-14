package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi;

import com.davidmarino.TestConfig;
import com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api.Dnd5eApiLanguage;
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
class Dnd5eApiLanguageTest {
    @Autowired
    private Dnd5eApiLanguages dnd5eApiLanguages;

    @Test
    public void whenGetLanguages_success() {
        Dnd5eApiNamedResourceList result = dnd5eApiLanguages.getLanguages();
    }

    @Test
    public void whenGetLanguageByIndex_success() {
        Dnd5eApiLanguage result = dnd5eApiLanguages.getLanguageByIndex("abyssal");
    }
}
