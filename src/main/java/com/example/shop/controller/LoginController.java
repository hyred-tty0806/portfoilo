package com.example.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.shop.entity.Customer;
import com.example.shop.service.CustomerService;
import com.example.shop.util.TeamColor;

import lombok.extern.slf4j.Slf4j;

import java.util.Optional;

@Slf4j
@Controller
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/login")
    public String loginPage() {
        return "login";  // login.jsp
    }

    @PostMapping("/login")
    public String getCustomerByUsernameAndPassword(
            @RequestParam String username,
            @RequestParam String password,
            Model model) {
    	
    	log.debug(TeamColor.ANSI_CYAN_BACKGROUND+TeamColor.ANSI_RED+"username : "+username+TeamColor.RESET);
    	log.debug(TeamColor.ANSI_CYAN_BACKGROUND+TeamColor.ANSI_RED+"password : "+password+TeamColor.RESET);
    	
        Optional<Customer> customerOpt = customerService.getCustomerByUsernameAndPassword(username, password);
        if (customerOpt.isPresent()) {
            model.addAttribute("customer", customerOpt.get());
            return "redirect:/customers/list";
        } else {
            return "customer-not-found";
        }
    }
}
