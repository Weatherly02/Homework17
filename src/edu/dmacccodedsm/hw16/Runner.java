package edu.dmacccodedsm.hw16;

public class Runner {

    public static void main(String[] args) {
        System.out.println("Starting runner...");

        TaskAssigner emailAssigner = new EmailTaskAssigner();
        TaskAssigner phoneAssigner = new PhoneTaskAssigner();
        TaskAssigner personAssigner = new InPersonTaskAssigner();
        User name = new User("Tammy", "Weatherly", "515 681 0418");
        User assigner = new User("Boss", "Henderson", "555-777-8888");


        emailAssigner.TaskAssigner(name, 10);
        phoneAssigner.TaskAssigner(name, 5);
        personAssigner.TaskAssigner(name, 3);
        System.out.printf("%s%n%n", name);

        TaskPerformer performTaskInPerson = new PerformTaskInPerson();
        TaskPerformer performOfficeTask = new PerformTaskAtOffice();
        TaskPerformer performDelegation = new PerformDelegationTasks();

        Task task = new Task("Filing", 20, name, assigner);

        System.out.println("Doing  InPerson: ");
        performTaskInPerson.performTask(task, name);

        System.out.println("Doing   OfficeTask:");
        performOfficeTask.performTask(task, name);

        System.out.printf("%nDoing  Delegation:%n");
        performDelegation.performTask(task, name);


    }
}
