class Employee {
    private double salary;

    Employee(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double amount) {
        if (amount > 0) {
            salary += amount;
            System.out.println("Salary increased.");
        } else {
            System.out.println("Salary cannot be decreased.");
        }
    }

    public void displaySalary() {
        System.out.println("Salary = Rs. " + salary);
    }
}

class SalaryDemo {
    public static void main(String[] args) {
        Employee e = new Employee(30000);

        e.displaySalary();

        e.increaseSalary(5000);
        e.displaySalary();

        e.increaseSalary(-2000);
        e.displaySalary();
    }
}