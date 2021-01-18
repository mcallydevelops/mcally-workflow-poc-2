package org.mcallydevelops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SampleFibonacciSequenceTask extends WorkflowTask<List<Integer>, List<Integer>> {

    private static List<Integer> fibs = new ArrayList<>();

    @Override
    public List<Integer> run(List<Integer> integers) {
        return fibSequence(fibs);
    }

    @Override
    public void rollback(List<Integer> integers) {
        fibs = new ArrayList<>();
    }

    private List<Integer> fibSequence(List<Integer> currFibs) {
        if(currFibs.size() == 0) {
            return fibSequence(Collections.singletonList(1));
        } else if(currFibs.size() == 1) {
            List<Integer> a = new ArrayList<>();
            a.add(1);
            a.add(1);
            return fibSequence(a);
        }
        if(currFibs.get(currFibs.size() - 1) > 100) {
            return currFibs;
        }
        var result = currFibs.get(currFibs.size() - 1) + currFibs.get(currFibs.size() - 2);
        currFibs.add(result);
        return fibSequence(currFibs);
    }
}
