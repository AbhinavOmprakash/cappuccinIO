import java.io.*;

public class StrTypeReader implements FReader {
    Reader reader;

    public StrTypeReader(String uri, int bufferSize) throws FileNotFoundException{
        reader = new BufferedReader(new FileReader(uri));
    }

    @Override
    public int[] readAll() {
        return new int[0];
    }

    @Override
    public int read() throws IOException {

        return reader.read();
    }

    public int read(char[] cbuf, int off, int len) throws IOException {
        return reader.read();
    }

    @Override
    public void close() throws IOException {
        reader.close();
    }
}
