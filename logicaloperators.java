import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Are you a citizen? (true/false): ");
        boolean citizen = sc.nextBoolean();
        if (age >= 18 && citizen) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are NOT eligible to vote.");
        }
        sc.close();
    }
}
