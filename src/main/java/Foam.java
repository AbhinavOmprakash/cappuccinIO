import java.io.*;

public class Foam implements Closeable {
    FReader reader;
    FWriter writer;

    public Foam(String uri, String mode, int bufferSize) throws IOException {
        switch (mode) {
            case "r":
                setReadMode(uri, bufferSize);
            case "w":
                setWriteMode(uri, bufferSize, false);
            case "a":
                setWriteMode(uri, bufferSize, true);
            case "rb":
                setByteReadMode(uri, bufferSize);
            case "wb":
                setByteWriteMode(uri, bufferSize, false);
            case "ab":
                setByteWriteMode(uri, bufferSize, true);
            default:
                setReadMode(uri, bufferSize);
        }
    }

    private void setReadMode(String uri, int bufferSize) throws IOException {
        reader = new StrTypeReader(uri, bufferSize);
    }

    private void setWriteMode(String uri, int bufferSize, boolean append) throws IOException {
        writer = new StrTypeWriter(uri, bufferSize, append);
    }

    private void setByteReadMode(String uri, int bufferSize) throws IOException {
        reader = new ByteTypeReader(uri, bufferSize);
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
        reader.close();
        writer.flush();
        writer.close();
    }

}
