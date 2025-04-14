package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi;

import com.davidmarino.TestConfig;
import com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api.Dnd5eApiDamageType;
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
class Dnd5eApiDamageTypeTest {
    @Autowired
    private Dnd5eApiDamageTypes dnd5eApiDamageTypes;

    @Test
    public void whenGetDamageTypes_success() {
        Dnd5eApiNamedResourceList result = dnd5eApiDamageTypes.getDamageTypes();
    }

    @Test
    public void whenGetDamageTypeByIndex_success() {
        Dnd5eApiDamageType dnd5eApiDamageType = dnd5eApiDamageTypes.getDamageTypeByIndex("acid");
    }
}
