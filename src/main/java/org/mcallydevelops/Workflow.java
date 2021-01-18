package org.mcallydevelops;

import java.util.UUID;

/*
POC -> execute workflow that generates a request ID, runs a task, and returns a result.
depending on the result of the request save the information
 */
public class Workflow<T, V> {
    private final WorkflowTask<T, V> task;
    private final UUID requestId;

    public Workflow(WorkflowTask<T, V> task) {
        this.task = task;
        this.requestId = UUID.randomUUID();
    }

    public V execute(T v) {
        return task.run(v);
    }
}
