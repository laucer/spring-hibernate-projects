package annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {

    @Value("${user.nick}")
    private String name;

    @Value("${user.email}")
    private String email;

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
