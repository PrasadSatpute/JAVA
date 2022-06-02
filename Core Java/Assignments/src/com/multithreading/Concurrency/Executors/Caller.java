
package com.multithreading.Concurrency.Executors;

import java.util.concurrent.Executor;

public class Caller implements Executor
{
	//Implement Executor interface which Forcefully Override the execute method
    @Override
    public void execute(Runnable runnable) {
        runnable.run();
    }
    
}