package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi;

import com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api.Dnd5eApiMagicItem;
import com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api.Dnd5eApiNamedResourceList;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "dnd5eapi-magicitems", url = "https://www.dnd5eapi.co/api/2014")
@Service
public interface Dnd5eApiMagicItems{
    @GetMapping("/magic-items")
    Dnd5eApiNamedResourceList getMagicItems();

    @GetMapping("/magic-items/{index}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    Dnd5eApiMagicItem getMagicItemByIndex(@PathVariable("index") String index);
}
