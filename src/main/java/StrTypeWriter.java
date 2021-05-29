import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class StrTypeWriter implements FWriter {
    Writer writer;

    public StrTypeWriter(String uri, int bufferSize, boolean append) throws IOException {
        writer= new java.io.BufferedWriter(new FileWriter(uri, append));
    }

    @Override
    public void write(int data) throws IOException {
        writer.write(data);
    }

    @Override
    public void write(char[] data) throws IOException {
        writer.write(data);
    }

    @Override
    public void write(String data) throws IOException {
        writer.write(data);
    }

    public void write(char[] cbuf, int off, int len) throws IOException {
        writer.write(cbuf, off, len);
    }

    @Override
    public void flush() throws IOException {
        writer.flush();
    }

    @Override
    public void close() throws IOException {
        writer.close();
    }
}
