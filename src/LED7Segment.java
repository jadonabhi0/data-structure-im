public class LED7Segment {

    static void countToggle(String str) {
        int[] array = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
        int total = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int a = Integer.parseInt(String.valueOf(ch));
            total += array[a];
        }
        System.out.println(total);
    }

    public static void main(String[] args) {
        countToggle("0189");
    }
}