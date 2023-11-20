package tryingJson;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    static ObjectMapper mapper = new ObjectMapper();
    public static void main(String[] args) {
        try{
            URL url = new URI("https://jsonplaceholder.typicode.com/users").toURL();
            InputStream stream = url.openStream();
            List<User> users = mapper.readValue(stream, new TypeReference<>() {});
            display(users);
            stream.close();
        }catch (Exception exception){
            System.err.println(exception.getMessage());
        }
    }
    public static void display(List<User> users){
        String location = "C:\\Users\\user\\IdeaProjects\\JavaToJson\\src\\tryingJson\\user.json";
        Path path = Paths.get(location);
        for (User value : users) {
            value.setName("Sulty");
            value.setUsername("BetLord");
            value.setEmail("sultbet@sulty.com");
            value.setPhoneNumber("777777777777777");
            value.setWebsite("betking.com.ng");
        }
        try(OutputStream outputStream = Files.newOutputStream(path);
            PrintStream printStream = new PrintStream(outputStream)) {
            for (User user : users) {
                System.out.println(user);
            }
            System.setOut(printStream);
            mapper.writeValue(System.out, users);
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
