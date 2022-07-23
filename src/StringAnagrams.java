public class StringAnagrams {

    static int a = 0;

    private static int count(char[] array,char c){

        int counter = 0;
        for (char i :array){
            if(i == c){
                counter++;

            }
        }
        return counter;
    }

    public static boolean isAnagram(String str1, String str2){
        boolean ans = false;
        if (str1.length() == str2.length()){
            var a = str1.toCharArray();
            var b = str2.toCharArray();

            for(int i=0 ,j = 0 ; i < a.length ; i++,j++){
                if(count(a,a[i]) == count(b,a[i])){
                     ans = true;
                }
                else{
                     ans = false;
                }
            }
        }
        else{
            ans  = false;
        }
        return ans;
    }


    public static void main(String [] args){
        System.out.println(isAnagram("Aman", "Aman"));


    }
}
