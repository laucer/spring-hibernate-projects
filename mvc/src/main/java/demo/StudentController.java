package demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;

@Controller
@RequestMapping("/student")

public class StudentController {

    @InitBinder
    public void initBinder(WebDataBinder dataBinder){
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @Value("#{${countries}}")
    private Map<String, String> countryOptions;

    @GetMapping("/login")
    public String loginForm(Model model) {
        model.addAttribute("student", new Student());
        model.addAttribute("countryOptions", countryOptions);
        return "student-form";
    }

    @PostMapping("/processForm")
    public String processForm(@Valid @ModelAttribute("student") Student student, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("countryOptions", countryOptions);
            return "student-form";
        }
        else
            return "student-confirmation";
    }
}
