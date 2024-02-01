package com.example.SpringEsercizio5;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/v1")
public class NameController {

    @GetMapping(path = "/getName")
    public String getName(@RequestParam String name){
        return name;
    }

    @GetMapping(path = "/reverseName")
    public StringBuilder reverseName(@RequestParam String name){
        StringBuilder reverse = new StringBuilder(name);
        return reverse.reverse();
    }
}
