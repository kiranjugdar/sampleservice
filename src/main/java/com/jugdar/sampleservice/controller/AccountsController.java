package com.jugdar.sampleservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class AccountsController {

    @GetMapping("/accounts")
    public List<Integer> getAccounts() {
        List<Integer> accounts = new ArrayList<>();
        accounts = Arrays.asList(1, 2, 3);

        return accounts;

    }


}
