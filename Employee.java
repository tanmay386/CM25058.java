class Employee {
    static double taxRate;

    // Static block runs only once
    static {
        taxRate = 10.0;
        System.out.println("Tax rate initialized.");
    }

    String name;

    Employee(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Employee: " + name);
        System.out.println("Tax Rate: " + taxRate + "%");
    }
}

class TaxDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee("Rahul");
        Employee e2 = new Employee("Amit");

        e1.display();
        e2.display();
    }
}