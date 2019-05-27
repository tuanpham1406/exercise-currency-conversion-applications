package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @GetMapping("/home")
    public String home() {
        return "index";
    }
    @RequestMapping("/next")
    public String next(@RequestParam double usd, Model model) {
        double vnd = 24000*usd;
        model.addAttribute("usd", vnd);
        return "result";
    }
}
