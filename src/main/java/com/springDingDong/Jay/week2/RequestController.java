package com.springDingDong.Jay.week2;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("request")
@RequiredArgsConstructor

public class RequestController {

    private final EntityManager em;

    @GetMapping("/test")
    public String test() {
        return "test";

    }
    @PostMapping("/member")
    @Transactional
    public Long testPost(@RequestBody  final Member member) {
        System.out.println("member: " + member);
        em.persist(member);
        return member.getId();
    }



}
