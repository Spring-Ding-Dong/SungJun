package com.springDingDong.Jay.week2;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(method = RequestMethod.GET, value = "")
public class HelloController {

    @GetMapping("hello")
    public String Hello() {
        return "Hello World";
    }

    @GetMapping("/name/{name}")
    public String getName(@PathVariable(value = "name") final String name) {
        return name;
    }

    @GetMapping("/pda")
    public String getPart(
            @RequestParam(value = "part", defaultValue = "") final String part,
            @RequestParam(value = "age", defaultValue = "") final String age
    ) {
        return "파트는 " + part + "이고, " + age + "입니다.";
    }


}


