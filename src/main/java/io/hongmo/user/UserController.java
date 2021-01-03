package io.hongmo.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/hello2")
    public String hello2() {
        return "hello2";
    }
}
