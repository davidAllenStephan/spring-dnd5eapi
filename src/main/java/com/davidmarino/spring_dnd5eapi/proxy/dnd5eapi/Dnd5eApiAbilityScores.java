package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi;

import com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api.Dnd5eApiAbilityScore;
import com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api.Dnd5eApiNamedResourceList;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "dnd5eapi-abilityscores", url = "https://www.dnd5eapi.co/api/2014")
public interface Dnd5eApiAbilityScores {
    @GetMapping("/ability-scores")
    Dnd5eApiNamedResourceList getAbilityScores();

    @GetMapping("/ability-scores/{index}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    Dnd5eApiAbilityScore getAbilityScoreByIndex(@PathVariable String index);
}
