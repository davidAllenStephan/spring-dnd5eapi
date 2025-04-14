package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi;

import com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api.*;
import com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api.Dnd5eApiEquipment;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "dnd5eapi-classes", url = "https://www.dnd5eapi.co/api/2014")
@Service
public interface Dnd5eApiClasses {
    @GetMapping("/classes")
    Dnd5eApiNamedResourceList getClasses();

    @GetMapping("/classes/{index}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    Dnd5eApiClass getClassByIndex(@PathVariable("index") String index);

    @GetMapping("/classes/{index}/subclasses")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    Dnd5eApiNamedResourceList getClassSubclassesByIndex(@PathVariable("index") String index);

    @GetMapping("/classes/{index}/starting-equipment")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    Dnd5eApiStartingEquipment getClassStartingEquipmentByIndex(@PathVariable("index") String index);

    @GetMapping("/classes/{index}/spellcasting")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    Dnd5eApiSpellCastingRef getClassSpellcastingByIndex(@PathVariable("index") String index);

    @GetMapping("/classes/{index}/spells")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    Dnd5eApiNamedResourceList getClassSpellsByIndex(@PathVariable("index") String index);

    @GetMapping("/classes/{index}/features")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    Dnd5eApiNamedResourceList getClassFeaturesByIndex(@PathVariable("index") String index);

    @GetMapping("/classes/{index}/proficiencies")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    Dnd5eApiNamedResourceList getClassProficienciesByIndex(@PathVariable("index") String index);

    @GetMapping("/classes/{index}/multi-classing")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    Dnd5eApiMultiClassing getClassMulticlassingByIndex(@PathVariable("index") String index);

    @GetMapping("/classes/{index}/levels")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    List<Dnd5eApiLevel> getClassLevelsByIndex(@PathVariable("index") String index);

    @GetMapping("/classes/{index}/levels/{level}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    Dnd5eApiLevel getClassLevelByIndexAndLevel(
        @PathVariable("index") String index,
        @PathVariable("level") int level
    );

    @GetMapping("/classes/{index}/levels/{level}/spells")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    Dnd5eApiNamedResourceList getClassSpellsByIndexAndLevel(
        @PathVariable("index") String index,
        @PathVariable("level") int level
    );

    @GetMapping("/classes/{index}/levels/{level}/features")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    Dnd5eApiNamedResourceList getClassFeaturesByIndexAndLevel(
        @PathVariable("index") String index,
        @PathVariable("level") int level
    );

}
