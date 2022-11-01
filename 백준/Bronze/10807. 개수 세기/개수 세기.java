import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int count = 0;

        int[] arr = new int[num];

        for(int i=0; i<num; i++) {
            arr[i] = sc.nextInt();
        }

        int b = sc.nextInt();

        for(int i=0; i<arr.length; i++) {
            if (arr[i] == b) count++;
        }
        System.out.println(count);
    }
}
