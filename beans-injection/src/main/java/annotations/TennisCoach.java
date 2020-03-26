package annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    @Autowired
    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Practice backhand!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
