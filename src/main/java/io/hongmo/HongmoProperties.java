package io.hongmo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("hongmo")
public class HongmoProperties {

    private String name;
    private int age;
    private String fullNmae;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullNmae() {
        return fullNmae;
    }

    public void setFullNmae(String fullNmae) {
        this.fullNmae = fullNmae;
    }
}
