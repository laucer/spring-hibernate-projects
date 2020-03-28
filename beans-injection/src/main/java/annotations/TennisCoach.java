package annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {

    @Value("${user.nick}")
    private String name;

    @Value("${user.email}")
    private String email;

    @PostConstruct
    public void postConstruct() {
        System.out.println("postConstruct()");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("preDestroy()");
    }

    @Autowired
    @Qualifier("sadFortuneService")
    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Practice backhand!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getEmail() {
        return email;
    }

}
