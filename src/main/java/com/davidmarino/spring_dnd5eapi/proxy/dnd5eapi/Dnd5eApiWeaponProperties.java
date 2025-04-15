package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi;

import com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api.Dnd5eApiNamedResourceList;
import com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api.Dnd5eApiWeaponProperty;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "dnd5eapi-weaponproperties", url = "https://www.dnd5eapi.co/api/2014")
public interface Dnd5eApiWeaponProperties {
    @GetMapping("/weapon-properties")
    Dnd5eApiNamedResourceList getWeaponProperties();

    @GetMapping("/weapon-properties/{index}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    Dnd5eApiWeaponProperty getWeaponPropertyByIndex(@PathVariable String index);
}
