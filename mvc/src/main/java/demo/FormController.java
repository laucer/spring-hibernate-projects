package demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class FormController {

    @GetMapping("/showForm")
    public String showForm() {
        return "hello-world-form";
    }

    @GetMapping("/processForm")
    public String processForm(HttpServletRequest request, Model model) {
        String message = request.getParameter("studentName");
        model.addAttribute("message","Hello " + message);
        return "hello-world-processed";
    }
}
