import java.util.*;

class student {
    String name;
    int age;

    public student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    @Override
//    public int compareTo(student o) {
//        if (this.age > o.age) return 1;
//        else if(this.age<o.age) return -1;
//        return this.name.compareTo(o.name);
//    }
}

// first way, if u don't want to create new comparator class then made annonmous class inside collection.sort

//class SortByAgeThenName implements Comparator<student>{
//
//    @Override
//    public int compare(student o1, student o2) {
//       if(o1.name.equals(o2.name)){
//           return o1.age - o2.age;
//       }else {
//           return o1.name.compareTo(o2.name);
//       }
//    }
//}

public class ComparatorAndComparable {


    public static void main(String[] args) {
        ArrayList<student> list  = new ArrayList<>();


        list.add(new student("Aman",52));
        list.add(new student("Aman",23));
        list.add(new student("Shikha",89));
        list.add(new student("Krishan",72));
        list.add(new student("Balram",12));

        // different ways to optimize the code

//        Collections.sort(list, new Comparator<student>() {
//            @Override
//            public int compare(student o1, student o2) {
//                if(o1.name.equals(o2.name)){
//          return o1.age - o2.age;
//      }else {
//          return o1.name.compareTo(o2.name);
//       }
//            }
//        });

//        Collections.sort(list,(o1, o2) -> {
//            if (o1.name.equals(o2.name)){
//                return o1.age - o2.age;
//            }
//            else {
//               return o1.name.compareTo(o2.name);
//            }
//        });

//        Collections.sort(list,(o1, o2) -> o1.name.compareTo(o2.name));

//        Collections.sort(list,Comparator.comparing(student::getName));
        Collections.sort(list,Comparator.comparing(student::getName).thenComparing(student::getAge));


       list.forEach(System.out::println);
    }


}
