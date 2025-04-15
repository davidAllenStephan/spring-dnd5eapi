package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi;

import com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api.Dnd5eApiMonster;
import com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api.Dnd5eApiNamedResourceList;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "dnd5eapi-monsters", url = "https://www.dnd5eapi.co/api/2014")
public interface Dnd5eApiMonsters{
    @GetMapping("/monsters")
    Dnd5eApiNamedResourceList getMonsters();

    @GetMapping("/monsters/{index}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    Dnd5eApiMonster getMonsterByIndex(@PathVariable("index") String index);
}
