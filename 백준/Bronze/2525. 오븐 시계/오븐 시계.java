import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 기존 시(a) 기존 분(b) 추가 분(c)
        // 더한 시간(분)이 1시간(60분)을 넘을 경우 기존 분+추가 분을 60으로 나눈 후 몫은 시에, 나머지는 분에 추가하면 된다
        // 더한 시간(시)이 24시를 넘을 경우 시에 24-(시를 구하는 공식)
        // 위 조건에 해당하지 않을 경우 기존 시간(분) + 추가 시간(분)만 해주면 된다

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a+((b+c)/60) > 23 && b+c >= 60) System.out.println(String.format("%d %d", Math.abs(24-(a+((b+c)/60))), (b+c)%60));

        else if(b+c >= 60) System.out.println(String.format("%d %d", a+((b+c)/60), (b+c)%60));

        else System.out.println(String.format("%d %d", a, b+c));
    }
}
