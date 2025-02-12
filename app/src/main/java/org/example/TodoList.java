package org.example;
import java.util.ArrayList;

public class TodoList
{
    private ArrayList<Task> list = new ArrayList<Task>();

    public void add(Task t)
    {
        this.list.add(t);

    }

    public void completeTask(String name)
    {
        int i = 0;
        boolean found = false;

        while (i < this.list.size() && found == false)
        {
            if (list.get(i).getName() == name)
            {
                list.get(i).markAsComplete();
                found = true;
            }
            i++;

        }

    }

    public ArrayList<String> all()
    {
        ArrayList<String> allList = new ArrayList<String>();

        for (Task elt : list)
        {
            allList.add(elt.getName());
        }

        return allList;

    }

    public ArrayList<String> complete()
    {
        ArrayList<String> compList = new ArrayList<String>();

        for (Task elt : list)
        {
            if(elt.isComplete())
            {
                compList.add(elt.getName());
            }
        }

        return compList;

    }

    public ArrayList<String> incomplete()
    {
        ArrayList<String> inList = new ArrayList<String>();

        for (Task elt : list)
        {
            if(!elt.isComplete())
            {
                inList.add(elt.getName());
            }
        }

        return inList;

    }

}