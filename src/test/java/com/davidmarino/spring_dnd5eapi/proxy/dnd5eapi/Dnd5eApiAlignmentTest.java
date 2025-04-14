package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi;

import com.davidmarino.TestConfig;
import com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api.Dnd5eApiNamedResourceList;
import com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api.Dnd5eApiAlignment;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@Import(TestConfig.class)
class Dnd5eApiAlignmentTest {
    @Autowired
    private Dnd5eApiAlignments dnd5eApiAlignments;

    @Test
    public void whenGetAlignments_success() {
        Dnd5eApiNamedResourceList result = dnd5eApiAlignments.getAlignments();
    }

    @Test
    public void whenGetAlignmentByIndex_success() {
        Dnd5eApiAlignment dnd5eApiAlignment = dnd5eApiAlignments.getAlignmentByIndex("chaotic-evil");
    }
}
