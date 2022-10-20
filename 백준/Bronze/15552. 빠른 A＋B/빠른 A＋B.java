import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int a = Integer.parseInt(br.readLine());

        for(int i=0; i<a; i++) {
            StringTokenizer tk = new StringTokenizer(br.readLine());

            int b = Integer.parseInt(tk.nextToken());
            int c = Integer.parseInt(tk.nextToken());
            bw.write(b + c + "\n");
        }
        bw.flush();
        bw.close();
    }
}
