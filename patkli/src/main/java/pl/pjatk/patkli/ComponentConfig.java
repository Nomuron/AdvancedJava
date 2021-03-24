package pl.pjatk.patkli;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ComponentConfig {

    @Bean
    public MySimpleClass mySimpleClass() {
        return new MySimpleClass("Hello from bean mySimpleClass");
    }

    @Bean
    public MySimpleClass mySecondSimpleClass() {
        return new MySimpleClass("Hello from bean mySecondSimpleClass");
    }

}
