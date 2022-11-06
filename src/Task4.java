import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Task4 {
    public static void main(String[] args) throws IOException {
        Files.createFile(Paths.get("asetFirstFile.txt"));
        String str = "Hello world";
        FileOutputStream outputStream = new FileOutputStream("asetFirstFile.txt");
        byte[] strToByte = str.getBytes();
        outputStream.write(strToByte);
        outputStream.close();

    }
}

