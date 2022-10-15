import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        // 0시 이고 45분 이전일 경우
        if(a == 0 && (b-45) < 0) System.out.println(String.format("23 %d", b+15));
        // 45분 이전일 경우
        else if((b-45) < 0) System.out.println(String.format("%d %d", a-1, b+15));
        // 나머지 경우
        else System.out.println(String.format("%d %d", a, b-45));
    }
}