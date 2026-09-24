import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        // Обмен через третью переменную
        int temp = a;
        a = b;
        b = temp;

        System.out.println(a + " " + b);
    }
}