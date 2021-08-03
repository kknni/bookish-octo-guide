package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @RequestMapping("/hi")
    public String hi(Model model) {
        model.addAttribute("go", 1997);
        model.addAttribute("sun", 11);
        model.addAttribute("young", 10);
        return "index";
    }

    @RequestMapping("/hi2")
    public ModelAndView hi2() {
        ModelAndView mav = new ModelAndView("index");
        return mav;
    }
}