package pureJava;

import annotations.Coach;
import annotations.FortuneService;
import annotations.HappyFortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:/pureJava/users.properties")
public class SportConfig {

    @Bean
    public FortuneService happyFortuneService() {
        return new HappyFortuneService();
    }

    @Bean
    public Coach swimCoach() {
        return new SwimCoach(happyFortuneService());
    }

}
