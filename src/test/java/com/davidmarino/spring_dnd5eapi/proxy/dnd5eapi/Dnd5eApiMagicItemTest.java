package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi;

import com.davidmarino.TestConfig;
import com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api.Dnd5eApiMagicItem;
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
class Dnd5eApiMagicItemTest {
    @Autowired
    private Dnd5eApiMagicItems dnd5eApiMagicItems;

    @Test
    public void whenGetMagicItems_success() {
        Dnd5eApiNamedResourceList result = dnd5eApiMagicItems.getMagicItems();
    }

    @Test
    public void whenGetMagicItemByIndex_success() {
        Dnd5eApiMagicItem result = dnd5eApiMagicItems.getMagicItemByIndex("ammunition");
    }
}
