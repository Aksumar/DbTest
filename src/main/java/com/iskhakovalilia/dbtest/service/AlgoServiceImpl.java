package com.iskhakovalilia.dbtest.service;

import com.iskhakovalilia.dbtest.algorithm.Algorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class AlgoServiceImpl implements AlgoService{
    Map<Integer, Algorithm> algorithms;

    public AlgoServiceImpl(@Autowired List<Algorithm> algorithms){
        this.algorithms = algorithms.stream()
                .collect(Collectors.toMap(algorithm -> algorithm.signalNumber.getNumber(), Function.identity()));
    }

    @Override
    public void handleSignal(int i) {
        algorithms.get(i).handleSignal(i);
    }
}
