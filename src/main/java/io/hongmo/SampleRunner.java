package io.hongmo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner implements ApplicationRunner {

//    @Value("${hongmo.name}")
//    private String name;
    @Autowired
    HongmoProperties hongmoProperties;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("====================================");
        System.out.println(hongmoProperties.getName());
        System.out.println("====================================");
    }
}
