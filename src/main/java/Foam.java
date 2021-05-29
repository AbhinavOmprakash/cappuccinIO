import java.io.*;

public class Foam implements Closeable {
    FReader reader;
    FWriter writer;
    java.io.BufferedReader bufferedReader;

    public Foam(String uri, String mode, int bufferSize) throws IOException {
        switch (mode) {
            case "w" -> writer = new StrTypeWriter(uri, bufferSize, false);
            case "a" -> writer = new StrTypeWriter(uri, bufferSize, true);
            case "rb" -> reader = new ByteTypeReader(uri, bufferSize);
            case "wb" -> writer = new ByteTypeWriter(uri, bufferSize, false);
            case "ab" -> writer = new ByteTypeWriter(uri, bufferSize, true);
            default -> reader = new StrTypeReader(uri, bufferSize);
        }
    }

    public Foam(String uri, String mode) throws IOException {
        this(uri, mode, 8192); //8192 is the default size of the buffer
    }

    private void setByteWriteMode(String uri, int bufferSize, boolean append) throws IOException {
        writer = new ByteTypeWriter(uri, bufferSize, append);
    }

    public int read() throws IOException {
        return reader.read();
    }

    public void write(String data) throws IOException {
        writer.write(data);
    }

    public void write(int data) throws IOException {
        writer.write(data);
    }

    @Override
    public void close() throws IOException {
        if(reader != null) {
            reader.close();
        }

        if(writer != null) {
            writer.flush();
            writer.close();
        }
    }

}
