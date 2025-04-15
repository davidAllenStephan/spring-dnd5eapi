package com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi;

import com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api.Dnd5eApiLevel;
import com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api.Dnd5eApiSubclass;
import com.davidmarino.spring_dnd5eapi.proxy.dnd5eapi.api.Dnd5eApiNamedResourceList;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "dnd5eapi-subclasses", url = "https://www.dnd5eapi.co/api/2014")
public interface Dnd5eApiSubclasses{
    @GetMapping("/subclasses")
    Dnd5eApiNamedResourceList getSubclasses();

    @GetMapping("/subclasses/{index}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    Dnd5eApiSubclass getSubclassByIndex(@PathVariable("index") String index);

    @GetMapping("/subclasses/{index}/features")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    Dnd5eApiNamedResourceList getSubclassFeaturesByIndex(@PathVariable("index") String index);

    @GetMapping("/subclasses/{index}/levels/{level}/features")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    Dnd5eApiNamedResourceList getSubclassLevelFeaturesByIndex(@PathVariable("index") String index, @PathVariable("level") String level);

    @GetMapping("/subclasses/{index}/levels/{level}")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    Dnd5eApiLevel getSubclassLevelByIndex(@PathVariable("index") String index, @PathVariable("level") String level);

    @GetMapping("/subclasses/{index}/levels")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    List<Dnd5eApiLevel> getSubclassLevelsForIndex(@PathVariable("index") String index);
}
