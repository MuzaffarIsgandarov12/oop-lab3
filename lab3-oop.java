import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = input.nextInt();

            if (number > 10 && number < 30) {
                sum += number;
                count++;
            }
        }

        if (count > 0) {
            System.out.println("The sum of the numbers between 10 and 30 is " + sum);
        } else {
            System.out.println("No numbers were entered between 10 and 30");
        }
    }
}