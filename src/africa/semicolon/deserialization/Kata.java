package africa.semicolon.deserialization;

import africa.semicolon.serialization.Car;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Kata {
    public static void main(String[] args) {
        String json = "{\"brand\":\"Toyota\", \"model\":\"Corolla\", \"color\":\"blue\"}";
        ObjectMapper mapper = new ObjectMapper();
        try {
            Car car = mapper.readValue(json, Car.class);
            System.out.println(car);
        }catch (IOException exception){
            System.err.println(exception.getMessage());
        }
    }
}
