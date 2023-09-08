package map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Synchronizing {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(4);
        nums.add(20);
        Collection<Integer> numbers = Collections.synchronizedList(nums);
        System.out.println(numbers);
    }
}
