import africa.semicolon.deserialization.Isogram;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsogramTest {
    Isogram isogram = new Isogram();
    @Test
    public void generatedResult(){
        assertFalse(isogram.check("Dele"));
    }
    @Test
    public void generatedResult1(){
        assertFalse(isogram.check("Eva"));
    }
    @Test
    public void allAll(){
        assertTrue(isogram.check("The qick brwn9_ fx jumps ov lazy dGGG"));
    }
}
