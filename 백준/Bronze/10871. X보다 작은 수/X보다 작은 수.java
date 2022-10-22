import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i=1; i<=a; i++) {
            int c = sc.nextInt();
            if(c < b) {
                System.out.print(c + " ");
            }
        }
    }
}