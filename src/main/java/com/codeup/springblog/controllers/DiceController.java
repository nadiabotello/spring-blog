package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DiceController {

    @GetMapping("/roll-dice")
    public String rollDice() {
        return "roll-dice";
    }

    @GetMapping("/roll-dice/{n}")
    public String showRoll(@PathVariable long n, Model model) {
        int random = (int)(Math.random() * 6 + 1);

//        boolean correctGuess = false;
//
//        if (n == random){
//            return String.valueOf(correctGuess);
//        }

        model.addAttribute("random", random);
        model.addAttribute("n", n);
        model.addAttribute("correctGuess", random == n);

        return "results-page";
    }



}
