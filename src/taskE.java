import java.util.Scanner;
public class taskE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int v = input.nextInt();
        int t = input.nextInt();
        int ans = (v * t) % 109;
        if (ans < 0) {
            ans += 109;
        }
        System.out.println(ans);
    }
}
