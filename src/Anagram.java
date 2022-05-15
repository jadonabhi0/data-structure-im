import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Anagram {

    public static boolean isAnagram(String s1, String s2){
        int sum1 = 0;
        int sum2 = 0;

        if (s1.length() != s2.length()) return false;

        for(int i = 0 ; i < s1.length() ; i++){
            sum1 += s1.codePointAt(i);
            sum2 += s2.codePointAt(i);
        }

        return sum1 == sum2 ;
    }



    public static void main(String[] args) {
        String a = "cat";
        String b = "act";
        System.out.println(isAnagram(a, b));






    }
}
