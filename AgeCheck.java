import java.util.Scanner;

class AgeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        String input = sc.next();

        // String to Integer
        Integer age = Integer.valueOf(input);

        if (age >= 18)
            System.out.println("Eligible");
        else
            System.out.println("Not Eligible");
    }
}