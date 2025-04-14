package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi;

import com.davidmarino.TestConfig;
import com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api.Dnd5eApiNamedResourceList;
import com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api.Dnd5eApiMagicSchool;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@Import(TestConfig.class)
class Dnd5eApiMagicSchoolTest {
    @Autowired
    private Dnd5eApiMagicSchools dnd5eApiMagicSchools;

    @Test
    public void whenGetMagicSchools_success() {
        Dnd5eApiNamedResourceList result = dnd5eApiMagicSchools.getMagicSchools();
    }

    @Test
    public void whenGetMagicSchoolByIndex_success() {
        Dnd5eApiMagicSchool dnd5eApiMagicSchool = dnd5eApiMagicSchools.getMagicSchoolByIndex("abjuration");
    }
}
