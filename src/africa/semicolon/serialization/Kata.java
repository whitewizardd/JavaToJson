package africa.semicolon.serialization;

import java.io.IOException;
import java.io.PrintStream;

public class Kata {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\user\\IdeaProjects\\JavaToJson\\src\\africa\\semicolon\\serialization\\output.txt";
        try(PrintStream printStream = new PrintStream(fileName)){
            //setOut state where to print it to...
            System.setOut(printStream);
            //it prints this sentence in the println to the file name provided because the setOut already specified the path...
            System.out.println("I will know this thing by God's grace, you dy whine? - Sultan, 2023...");
        }catch (IOException exception){
            System.err.println(exception.getMessage());
        }
    }
}
