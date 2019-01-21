package decorator.iodec;

import org.junit.Test;

import java.io.*;

/**
 * Class LowerCaseInputStreamTest.
 *
 * @author Konstantin Alekseev.
 * @version 1.0.
 * @since 20.01.2018.
 */
public class LowerCaseInputStreamTest {

    @Test
    public void whenReceiveAByteArrayWhithinUpperCaseSymbolsTheHasToCastThemToLowerCase() {
        int c;
        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("test.txt")));
            while ((c = in.read()) >= 0) {
                System.out.println((char) c);
            }

            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}