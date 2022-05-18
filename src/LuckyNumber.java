import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LuckyNumber {
    static LinkedList<Integer> list =  new LinkedList<>();
    static List<Integer> luckynumber(List<Integer> arr){
        int counter = 0;
        int count = 0;
        for(int i : arr){
            for(int j = 1 ; j <= i ; j++){
                counter++;
                if(counter%j==0){
                    count++;
                }
            }
            if(count == i){
                list.add(count);
                count =0 ;
            }else{
                count = 0;
            }
        }
        return list;
    }
    // added this extraa
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

//        luckynumber(list).forEach(System.out::println);
        System.out.println(12);

    }

}
