import java.util.Scanner;
public class taskJ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int v = input.nextInt();
        System.out.println(v + 2 - v % 2);
    }
}
