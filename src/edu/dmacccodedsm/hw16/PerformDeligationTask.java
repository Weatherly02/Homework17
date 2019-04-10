package edu.dmacccodedsm.hw16;

import java.util.List;

public class PerformDeligationTask extends TaskPerformer {
    @Override
    public void performTask(Task task, User user) {
        //super.performTask(task, user);
        System.out.println("This is from the Perform Deligation subclass " + task.getToDo());
    }

    @Override
    public void performTask(Task task, List<User> users) {
        //super.performTask(task, users);
    System.out.println("This is from the Perform Deligation subclass");
    }
}

