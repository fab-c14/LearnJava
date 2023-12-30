import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class tryfinally {
    public static void main(String[] args) throws IOException {
        // try {
        // // exception generation
        // int j = 9 / 0;
        // System.out.println("i will not be printed");
        // } catch (Exception e) {
        // System.out.println("exception occured");
        // } finally {
        // System.out.println("finally i executed, i will execute in any circumstance");
        // }
        int num;
        BufferedReader br = null;
        // try {
        // InputStreamReader in = new InputStreamReader(System.in);
        // br = new BufferedReader(in)
        // num = Integer.parseInt(br.readLine());
        // System.out.println(num);
        // } catch (Exception e) {
        // // TODO: handle exception
        // } finally {
        // br.close();
        // }

        // try with resources
        try (BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in))) {
            num = Integer.parseInt(br.readLine());
        }
    }
}
