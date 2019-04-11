package edu.dmacccodedsm.hw16;

import java.util.List;

public class PerformDelegationTasks extends TaskPerformer {
    @Override
    public void performTask(Task task, User user) {
        System.out.println("This is from the PerformDelegationTasks subclass");
    }

    @Override
    public void performTask(Task task, List<User> users) {

    }
}
