import admin.Manager;
import hr.Employee;

class Test {
    public static void main(String[] args) {

        Employee e = new Employee();

        System.out.println("Public: " + e.publicData);

        e.showPrivate();

        Manager m = new Manager();
        m.display();
    }
}
