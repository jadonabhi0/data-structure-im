import java.util.Stack;

public class RLpair {

    static int find(String s){
        int c = 0;
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i < s.length() ; i ++){
            if(s.charAt(i) == 'R'){
                st.push(s.charAt(i));
            }else{
               if (st.size() > 0){
                   if (st.pop() == 'R'){
                       c++;
                   }
               }
            }
        }
        return c;
    }

    public static void main(String[] args) {
        String s = "LLLRRR";
        System.out.println(find(s));
    }

}
