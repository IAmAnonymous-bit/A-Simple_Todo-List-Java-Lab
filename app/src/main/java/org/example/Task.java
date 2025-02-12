package org.example;

public class Task
{
    private String name;
    private boolean complete;

    public Task(String name)
    {
        this.name = name;
        this.complete = false;
    }

    public void markAsComplete()
    {
        complete = true;
    }
    
    public String getName()
    {
        return name;
    }

    public boolean isComplete()
    {
        return complete;
    }
}