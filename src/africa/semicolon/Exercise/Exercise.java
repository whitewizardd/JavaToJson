package africa.semicolon.Exercise;

import java.util.Arrays;

public class Exercise {

    public static int[] swap(int[] array, int firstIndex, int secondIndex) {
        array[firstIndex] = array[firstIndex] + array[secondIndex];
        array[secondIndex] = array[firstIndex] - array[secondIndex];
        array[firstIndex] = array[firstIndex] - array[secondIndex];
        return array;
    }
}
