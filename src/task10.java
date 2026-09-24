import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int v = input.nextInt();
        System.out.println(v + 2 - v % 2);
    }
}