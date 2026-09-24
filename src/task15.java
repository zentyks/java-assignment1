import java.util.Scanner;

public class task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        int t = (a * 100 + b) * n;

        int r = t / 100;
        int k = t % 100;

        System.out.println(r + " " + k);
    }
}