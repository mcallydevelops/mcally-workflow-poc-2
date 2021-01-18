package org.mcallydevelops;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class WorkflowRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        WorkflowTask<List<Integer>, List<Integer>> task = new SampleFibonacciSequenceTask();
        Workflow<List<Integer>, List<Integer>> workflow = new Workflow<>(task);
        var result = workflow.execute(new ArrayList<Integer>());
        result.forEach(x -> {
            System.out.println(x);
        });
    }
}
