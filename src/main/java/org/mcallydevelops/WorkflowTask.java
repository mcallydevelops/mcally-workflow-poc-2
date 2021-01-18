package org.mcallydevelops;

public abstract class WorkflowTask<T, V> {

    public abstract V run(T t);
    public abstract void rollback(T t);

}
