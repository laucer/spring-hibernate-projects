package demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Value("#{${countries}}")
    private Map<String, String> countryOptions;

    @GetMapping("/login")
    public String loginForm(Model model) {
        model.addAttribute("student", new Student());
        model.addAttribute("countryOptions", countryOptions);
        return "student-form";
    }

    @PostMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student student) {
        return "student-confirmation";
    }
}
