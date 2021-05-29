import java.io.IOException;

public interface FWriter {
    void write(int data) throws IOException;
    void write(char[] data) throws IOException;
    void write(String data) throws IOException;
    void close() throws IOException;
    void flush() throws IOException;
}
