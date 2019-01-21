package decorator.iodec;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Class LowerCaseInputStream.
 *
 * @author Konstantin Alekseev.
 * @version 1.0.
 * @since 20.01.2018.
 */
public class LowerCaseInputStream extends FilterInputStream {

    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    public LowerCaseInputStream(InputStream in) {
        super(in);
    }

    /**
     * Method read - cast every symbol received from a byte to lower case.
     *
     * @return lower case character.
     * @throws IOException when something is wrong.
     */
    public int read() throws IOException {
        int c = super.read();
        return (c == -1 ? c : Character.toLowerCase((char) c));
    }

    /**
     * Method read - cast every symbol received from a array of bytes to lower case.
     *
     * @param b - array of bytes.
     * @param offset - offset.
     * @param len - length.
     * @return lower case character.
     * @throws IOException when something is wrong.
     */
    public int read(byte[] b, int offset, int len) throws IOException {
        int result = super.read(b, offset, len);
        for (int i = offset; i < offset + result; i++) {
            b[i] = (byte) Character.toLowerCase((char) b[i]);
        }
        return result;
    }
}
