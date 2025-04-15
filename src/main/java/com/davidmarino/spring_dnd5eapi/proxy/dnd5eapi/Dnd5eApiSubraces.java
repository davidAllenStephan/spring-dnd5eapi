package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi;

import com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api.Dnd5eApiNamedResourceList;
import com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api.Dnd5eApiSubrace;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "dnd5eapi-subraces", url = "https://www.dnd5eapi.co/api/2014")
public interface Dnd5eApiSubraces {
    @GetMapping("/subraces")
    Dnd5eApiNamedResourceList getSubraces();

    @GetMapping("/subraces/{index}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    Dnd5eApiSubrace getSubraceByIndex(@PathVariable String index);

    @GetMapping("/subraces/{index}/traits")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    Dnd5eApiNamedResourceList GetSubraceTraitsByIndex(@PathVariable String index);

    @GetMapping("/subraces/{index}/proficiencies")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    Dnd5eApiNamedResourceList GetSubraceProficienciesByIndex(@PathVariable String index);
}
