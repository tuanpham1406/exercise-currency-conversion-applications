package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingCtronller {
    @RequestMapping("/home")
    public String home() {
        return "/index";
    }
    @RequestMapping("/next")
    public String result(@RequestParam double usd, Model model) {
        double vnd = usd*24000;
        model.addAttribute("vnd", vnd);
        return "/result";
    }
}
