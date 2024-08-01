import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        byte[] bytes = "Hello, World!".getBytes(StandardCharsets.UTF_8);
        InputStream inputStream = new ByteArrayInputStream(bytes);
        DecodeStream decoder = new DecodeStream();
        String decodedString = decoder.decode(inputStream);
        System.out.println(decodedString);
    }
}
