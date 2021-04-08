import java.util.HashSet;
import java.util.Set;

public class Test {

    public static void main(String[] args) {

        /*String a = "abc";
        System.out.println(a);
        System.out.println(a);
        System.out.println(a);
        System.out.println(a);
        System.out.println(a);
        String b = a+"ddd";
        System.out.println(b);*/


        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(3);
        set.add(4);

//        System.out.println(set.iterator().next());
//        set.remove(1);
        /*System.out.println(set.iterator().next());
        set.remove(3);
        System.out.println(set.iterator().next());
        set.remove(4);
        System.out.println(set.iterator().next());*/

        set.forEach(System.out::println);

    }

}
