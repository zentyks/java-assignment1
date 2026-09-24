import java.util.Scanner;

public class task16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        int hour = d * 3600 - a * 3600;
        int minute = e*60 - b*60;
        int second = f-c;
        System.out.println((hour+minute+second));

    }
}