package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi;

import com.davidmarino.TestConfig;
import com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api.Dnd5eApiNamedResourceList;
import com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api.Dnd5eApiSkill;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@Import(TestConfig.class)
class Dnd5eApiSkillTest {
    @Autowired
    private Dnd5eApiSkills dnd5eApiSkills;

    @Test
    public void whenGetSkills_success() {
        Dnd5eApiNamedResourceList result = dnd5eApiSkills.getSkills();
    }

    @Test
    public void whenGetSkillByIndex_success() {
        Dnd5eApiSkill dnd5eApiSkill = dnd5eApiSkills.getSkillByIndex("acrobatics");
    }
}
