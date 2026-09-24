import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        System.out.println("The next number for the number " + num + " is " + (num + 1) + ".");
        System.out.println("The previous number for the number " + num + " is " + (num - 1) + ".");
    }
}