import java.io.*;

public class ByteTypeReader implements FReader {
    InputStream reader;
    public ByteTypeReader(String uri, int bufferSize) throws FileNotFoundException, ObjectStreamException {
        reader = new BufferedInputStream(new FileInputStream(uri), bufferSize);
    }

    @Override
    public int[] readAll() {
        return new int[0];
    }

    @Override
    public void close() throws IOException {

    }

    @Override
    public int read() {
        return 0;
    }
}
