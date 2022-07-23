import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class PracticeSets {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(5);
        hashSet.add(6);
        hashSet.add(7);
        hashSet.add(8);
//        Iterator<Integer> a = hashSet.iterator();
//        while(a.hasNext()){
//            System.out.println(a.next());
//        }
        for (Integer i:hashSet
             ) {
            System.out.println(i*2);
        }


    }
}
