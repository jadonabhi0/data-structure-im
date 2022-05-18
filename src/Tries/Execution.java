package Tries;

public class Execution {

    public static void main(String[] args) {
        Tries t = new Tries();
        t.insert("ahishek");
        t.insert("abhi");
        t.insert("aman");

        System.out.println(t.search("aman"));
    }
}
