package dev.akashpatil.moneyflow.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MoneyFlowController {

    @GetMapping("/")
    public String sayMoneyFlow(){
        return "Money Flow ";
    }

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello";
    }
}
