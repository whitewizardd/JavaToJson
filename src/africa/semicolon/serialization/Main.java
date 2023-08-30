package africa.semicolon.serialization;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        Car car = new Car();
        car.setColor("green");
        car.setBrand("Lexus");
        car.setMileage(100L);
        car.setModel("Rx2022");
        try {
            objectMapper.writeValue(System.out, car);
        }catch (IOException exception){
            System.err.println(exception.getMessage());
        }
    }
}
