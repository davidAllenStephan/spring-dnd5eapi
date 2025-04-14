package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi;

import com.davidmarino.TestConfig;
import com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api.Dnd5eApiEquipment;
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
class Dnd5eApiEquipmentTest {
    @Autowired
    private Dnd5eApiEquipments dnd5eApiEquipments;

    @Test
    public void whenGetEquipments_success() {
        Dnd5eApiNamedResourceList result = dnd5eApiEquipments.getEquipments();
        System.out.println(result.getResults());
    }

    @Test
    public void whenGetEquipmentByIndex_success() {
        Dnd5eApiEquipment result = dnd5eApiEquipments.getEquipmentByIndex("abacus");
        System.out.println(result);
    }
}
