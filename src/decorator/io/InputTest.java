package decorator.io;

import java.io.*;

/**
 * Created by Rafael on 2016-11-02.
 */
public class InputTest {

    public static void main(String[] args) throws IOException {
        int c;

        try (InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("test.txt")))) {
            while ((c = in.read()) >= 0) {
                System.out.print((char)c);
            }
        }
    }

}
