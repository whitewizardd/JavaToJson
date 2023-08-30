package africa.semicolon.serialization;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;


public class KataKata {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        Car car = new Car();
        car.setColor("green");
        car.setBrand("Lexus");
        car.setMileage(100L);
        car.setModel("Rx2022");
        String location = "C:\\Users\\user\\IdeaProjects\\JavaToJson\\src\\africa\\semicolon\\serialization\\cars.json";
        Path path = Path.of(location);
        try (OutputStream outputStream = Files.newOutputStream(path);
             PrintStream printStream = new PrintStream(outputStream)){
            System.setOut(printStream);
            objectMapper.writeValue(System.out, car);
        }catch (IOException exception){
            System.err.println(exception.getMessage());
        }
    }
}
