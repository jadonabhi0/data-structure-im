import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class FindDuplicates {
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new LinkedList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }


        for(Map.Entry<Integer, Integer> m : map.entrySet()) {
            if(m.getValue() > 1){
                list.add(m.getKey());
            }
        }
        return list;
    }

    public static void main(String[] args) {

        System.out.println(findDuplicates(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
    }

}
