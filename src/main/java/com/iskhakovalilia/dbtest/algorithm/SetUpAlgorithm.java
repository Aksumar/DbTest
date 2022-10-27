package com.iskhakovalilia.dbtest.algorithm;

import com.iskhakovalilia.dbtest.algorithmType.AwesomeGroup;
import com.iskhakovalilia.dbtest.lib.Algo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SetUpAlgorithm extends Algorithm {

    SetUpAlgorithm(){
        signalNumber = AwesomeGroup.SIGNAL_1;
    }

    @Autowired
    Algo algo;

    @Override
    public void handleSignal(int signal) {
        algo.setUp();
        algo.setAlgoParam(1,60);
        algo.performCalc();
        algo.submitToMarket();
    }
}
