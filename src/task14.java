import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();

        int b = (n - 1) / 2;
        int s = (n - 1) - b;

        int t = 9 * 60 + n * 45 + s * 5 + b * 15;

        int h = t/ 60;
        int m = t % 60;

        System.out.println(h + " " + m);
    }
}