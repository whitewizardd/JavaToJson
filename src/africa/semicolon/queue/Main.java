package africa.semicolon.queue;

import java.util.*;
import java.util.LinkedList;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {
    public static void main(String[] args) {
        Comparator<Candidate> comparator =
        (firstCandidate, secondCandidate) ->
                firstCandidate.getParty()
                        .compareTo(secondCandidate.getParty());
        Queue<Candidate> candidates = new PriorityQueue<>(comparator);
//        Queue<Candidate> candidates = new LinkedList<>();
        //with the implementation of the ArrayBlockingList, one is forced to add the queue size just like the array.
//        Queue<Candidate> candidates = new ArrayBlockingQueue<>(5);
        candidates.offer(new Candidate("Asiwaju", "APC"));
        candidates.offer(new Candidate("Asiwaju", "PDP"));
        candidates.offer(new Candidate("Asiwaju", "NNPP"));
        candidates.offer(new Candidate("Asiwaju", "LP"));
        candidates.offer(new Candidate("Asiwaju", "APC"));
        //the add method throws an exception when the queue is full and don not add to the queue again...
        //the offer method does not throw an exception even thought the queue is full...
//        candidates.offer(new Candidate("Atiku", "PDP"));
//        System.out.println(candidates);
//        System.out.println(candidates.peek());//return the first element in the queue;
//        System.out.println("before the poll "+ candidates);
//        System.out.println(candidates.poll());//remove and returned the removed element
//        System.out.println("After the poll "+candidates);
        System.out.println(candidates);
    }
}
