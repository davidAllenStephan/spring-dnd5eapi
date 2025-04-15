package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi;

import com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api.Dnd5eApiRace;
import com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api.Dnd5eApiNamedResourceList;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "dnd5eapi-races", url = "https://www.dnd5eapi.co/api/2014")
public interface Dnd5eApiRaces{
    @GetMapping("/races")
    Dnd5eApiNamedResourceList getRaces();

    @GetMapping("/races/{index}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    Dnd5eApiRace getRaceByIndex(@PathVariable("index") String index);

    @GetMapping("/races/{index}/subraces")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    Dnd5eApiNamedResourceList getRaceSubracesByIndex(@PathVariable("index") String index);

    @GetMapping("/races/{index}/proficiencies")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    Dnd5eApiNamedResourceList getRaceProficienciesByIndex(@PathVariable("index") String index);

    @GetMapping("/races/{index}/traits")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    Dnd5eApiNamedResourceList getRaceTraitsByIndex(@PathVariable("index") String index);
}
