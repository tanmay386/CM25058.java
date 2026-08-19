class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Instance method
    double calculateBonus() {
        return salary * 0.10;
    }

    // Static method
    static String taxSlab() {
        return "Tax slab: 10%";
    }
}

class EmployeeDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee("Rahul", 50000);
        Employee e2 = new Employee("Amit", 60000);

        System.out.println(e1.name + " Bonus = Rs. "
                + e1.calculateBonus());

        System.out.println(e2.name + " Bonus = Rs. "
                + e2.calculateBonus());

        System.out.println(Employee.taxSlab());
    }
}