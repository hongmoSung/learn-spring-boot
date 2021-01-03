package io.hongmo.user;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @GetMapping("/hello2")
    public String hello2() {
        return "hello2";
    }

    @PostMapping("/user/create")
    public @ResponseBody User create(@RequestBody User user) {
        return user;
    }
}
