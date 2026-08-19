package admin;

import hr.Employee;

public class Manager extends Employee {

    public void display() {
        System.out.println("Public: " + publicData);

        // Protected is accessible in subclass
        System.out.println("Protected: " + protectedData);

        // privateData cannot be accessed here
    }
}