package com.codegym.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
@RequestMapping("/")
public class SandwichCondiments {
    @GetMapping()
    public ModelAndView getSmthing(){
        ModelAndView getsmt = new ModelAndView("index");
        return getsmt;
    }
    @PostMapping()
    public ModelAndView save (@RequestParam("condiment") String condiment ) {
        ModelAndView getCondiment = new ModelAndView("index");
        ArrayList<String> ListCondiment = new ArrayList<>();
        ListCondiment.add(condiment);
        if (ListCondiment.size() > 0) {
            for(String condiments : ListCondiment) {
                getCondiment.addObject("say", "You added");
                getCondiment.addObject("result", condiments);
            }
            return getCondiment;
        } else {
            return getCondiment;
        }
    }

}
