package africa.semicolon.Exercise;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ExerciseTest {
    @Test
    public void swapTest(){
        int[] array = {2, 4, 6, 8};
        int[] expected = {2, 6, 4, 8};
        assertArrayEquals(expected, Exercise.swap(array, 1, 2));
    }
    @Test
    public void swapTestA(){
        int[] array = {2, 4, 6, 8};
        int[] expected = {8, 4, 6, 2};
        assertArrayEquals(expected, Exercise.swap(array, 0, 3));
    }
}