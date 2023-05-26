package rikkei.academy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import rikkei.academy.model.Spices;
import rikkei.academy.service.ISpicesService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping(value = {"/", "/save"})
public class SandwichController {
    @Autowired
    private ISpicesService spicesService;

    @GetMapping
    public ModelAndView showForm() {
        ModelAndView modelAndView = new ModelAndView("spices/index");
        List<Spices> spices = spicesService.findAll();
        modelAndView.addObject("spicesToView", spices);
        return modelAndView;
    }

    @PostMapping("/save")
    public ModelAndView actionSave(@RequestParam("condiment") String[] condiments) {
        ModelAndView modelAndView = new ModelAndView("spices/sandwich");
        List<String> condimentList = new ArrayList<>(Arrays.asList(condiments));
        modelAndView.addObject("condimentsToView", condimentList);
        return modelAndView;
    }
}
