package com.iskhakovalilia.dbtest.controller;

import com.iskhakovalilia.dbtest.service.AlgoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AlgorithmController {
    private final AlgoService algoService;

    @PostMapping("/signal/{id}")
    void handleSignal(@PathVariable Integer id) {
        algoService.handleSignal(id);
    }
}
