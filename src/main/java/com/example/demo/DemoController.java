package com.example.demo;

import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author devin
 */
@RestController
public class DemoController {

    @PostMapping("/foo")
    public Mono<Map<String , Object>> postFoo() {
        Map<String, Object> map = new HashMap<>(2);
        map.put("name", "bar");
        return Mono.just(map);
    }

    @GetMapping("/get")
    public Map<String ,String> get(ServerHttpRequest request) {
        return request.getHeaders().toSingleValueMap();
    }
}
