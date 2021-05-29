import java.io.FileReader;
import java.io.IOException;

public class testing {
    public static void main(String[] args) throws IOException {
        String uri = "C:\\Users\\abhin\\IdeaProject\\cappucinIO\\src\\main\\java\\testFile.txt";
//        Foam file = new Foam(uri);

        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(
                new FileReader(uri));

        int data = bufferedReader.read();
        System.out.println((char) data);

        while (data !=-1){
            System.out.println((char) data);

            data = bufferedReader.read();
        }
//        file.close();
        bufferedReader.close();
        System.out.println("im running");
    }
}
