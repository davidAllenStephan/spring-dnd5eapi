package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi;

import com.davidmarino.TestConfig;
import com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api.Dnd5eApiEquipmentCategory;
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
class Dnd5eApiEquipmentCategoryTest {
    @Autowired
    private Dnd5eApiEquipmentCategories dnd5eApiEquipmentCategories;

    @Test
    public void whenGetEquipmentCategories_success() {
        Dnd5eApiNamedResourceList result = dnd5eApiEquipmentCategories.getEquipmentCategories();
    }

    @Test
    public void whenGetEquipmentCategoryByIndex_success() {
        Dnd5eApiEquipmentCategory dnd5eApiEquipmentCategory = dnd5eApiEquipmentCategories.getEquipmentCategoryByIndex("adventuring-gear");
    }
}
