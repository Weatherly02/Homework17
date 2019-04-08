package edu.dmacccodedsm.hw16;

public class Runner {

    public static void main(String[] args) {
        System.out.println("Starting runner...");

        TaskAssigner emailAssigner = new EmailTaskAssigner();
        TaskAssigner phoneAssigner = new PhoneTaskAssigner();
        TaskAssigner personAssigner = new InPersonTaskAssigner();
        User name = new User("Tammy", "Weatherly", "515 681 0418");

        emailAssigner.TaskAssigner(name, 10);
        phoneAssigner.TaskAssigner(name, 5);
        personAssigner.TaskAssigner(name, 3);
        System.out.println(name);

    }
}
