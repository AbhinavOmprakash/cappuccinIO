import java.io.*;

public class ByteTypeWriter implements FWriter {
    OutputStream writer;

    public ByteTypeWriter(String uri, int bufferSize, boolean append) throws FileNotFoundException {
        writer=new BufferedOutputStream(new FileOutputStream(uri, append));
    }

    @Override
    public void write(char[] data) {

    }

    @Override
    public void write(String data) {

    }

    @Override
    public void close() throws IOException {

    }

    @Override
    public void flush() throws IOException {

    }

    @Override
    public void write(int b) {
    }
}
