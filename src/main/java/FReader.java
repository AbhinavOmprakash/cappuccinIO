import java.io.IOException;

public interface FReader {
    int read() throws IOException;
    int[] readAll() throws IOException;
    void close() throws IOException;
}
