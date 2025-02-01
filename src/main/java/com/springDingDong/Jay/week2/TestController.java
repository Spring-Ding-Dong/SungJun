package com.springDingDong.Jay.week2;

import org.springframework.web.bind.annotation.*;

@RestController

public class TestController {
    @PostMapping("member")
    public String postMember(@RequestBody final Member member) {
        return member.getName();
    }
}
