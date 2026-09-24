import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int v = input.nextInt();
        int s = v / 100;
        int f = v % 10;
        int r = (v / 10) % 10;




        System.out.println(s+f+r);

    }
}