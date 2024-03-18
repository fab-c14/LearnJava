import java.io.*;

public class IPC {
    public static void main(String[] args) throws IOException{
        PipedInputStream in = new PipedInputStream();
        PipedOutputStream out = new PipedOutputStream(in); // pass in object to connect pipes

        Thread t1 = new Thread(()->{
            try {
                out.write("Hello world".getBytes());
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            try {
                out.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });
        Thread t2 = new Thread(()->{
            byte[] bytes = new byte[1024];
            int read;
            try {
                read = in.read(bytes);
                System.out.println(new String(bytes,0,read));
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        });
        t1.start();
        t2.start();
    }
}
