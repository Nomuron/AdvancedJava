package pl.pjatk.patkli;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SecondConfig {

    @Bean
    public POJO pojo(
            @Value("${my.custom.property}") String valueFromProperties,
            @Value("${my.custom.random:Siema Heniu!}") String randomValueFromProperties
    ) {
        System.out.println(valueFromProperties);
        System.out.println(randomValueFromProperties);
        return new POJO(1, 2, "Zbyniu", false);
    }

    @Bean
    @ConditionalOnProperty(value = "my.custom.bean", havingValue = "true")
    public void checkBool() {
        System.out.println("Value in yml is true");
    }

    @Bean
    public List<String> defaultData() {
        return List.of("a", "s", "d", "f", "g");
    }

}
