package africa.semicolon.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {
    public static void main(String[] args) {
//        Queue<Candidate> candidates = new LinkedList<>();
        Queue<Candidate> candidates = new ArrayBlockingQueue<>(5);
        candidates.offer(new Candidate("Asiwaju", "APC"));
        candidates.offer(new Candidate("Asiwaju", "APC"));
        candidates.offer(new Candidate("Asiwaju", "APC"));
        candidates.offer(new Candidate("Asiwaju", "APC"));
        candidates.offer(new Candidate("Asiwaju", "APC"));
        //the add method throws an exception when the queue is full and don not add to the queue again...
        //the offer method does not throw an exception even thought the queue is full...
        candidates.offer(new Candidate("Atiku", "PDP"));
        System.out.println(candidates);
    }
}
