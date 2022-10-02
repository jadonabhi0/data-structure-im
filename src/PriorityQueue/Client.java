package PriorityQueue;

public class Client {
    public static void main(String[] args) {

        HeapPep pq = new HeapPep();

        pq.insert(67);
        pq.insert(17);
        pq.insert(47);
        pq.insert(-97);
        pq.insert(3700);
        pq.insert(617);
        pq.insert(0);
//        System.out.println(pq.peek());
//        System.out.println(pq.size());
        while(pq.size() > 0){
            System.out.println(pq.peek());
            pq.poll();
        }

    }

}
