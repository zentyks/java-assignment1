import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int v = input.nextInt();
        v = v % 1440;
        int d = v / 60;
        int h = v % 60;
        System.out.println(d + " " + h);
    }
}