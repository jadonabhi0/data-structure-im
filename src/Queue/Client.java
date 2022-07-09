package Queue;

public class Client {

    public static void main(String[] args) {

//        QueueUsingArrayList q = new QueueUsingArrayList();
        QueueUsingTwoStack<Integer> q = new QueueUsingTwoStack<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);

      while (!q.isEmpty()){
          System.out.println(q.peek());
          q.poll();
      }


    }


}
