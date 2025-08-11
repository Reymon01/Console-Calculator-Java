import java.util.Scanner;

public class ConsoleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 2 number for calculation: ");
        float num1 = input.nextFloat();
        float num2 = input.nextFloat();
        System.out.println("Choose which option you want to perform:\n" +
                "A. +\nB. -\nC. x\nD. / ");
        input.nextLine();
        String operation = input.nextLine();

        if (operation.equalsIgnoreCase("a")) {
            float sum = num1 + num2;
            System.out.println("The sum is: " + sum);
        }
        else if (operation.equalsIgnoreCase("b")) {
            float sub = num1 - num2;
            System.out.println("The subtraction is: " + sub);
        } else if (operation.equalsIgnoreCase("c")) {
            float mult = num1 * num2;
            System.out.println("The multiplication is: " + mult);
        } else if (operation.equalsIgnoreCase("c")) {
            float div = num1 / num2;
            System.out.println("The division is: " + div);
        } else System.out.println("Enter Valid Option");
    }
}
