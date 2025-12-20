
import java.util.*;
public class ListInterface {
    public static void main(String [] args){
        List<String> s1 = new ArrayList<String>();
        s1.add("darshan");
        s1.add("darshan2");
        s1.add("darshan3");
        s1.add("darshan4");

        System.out.println("array list is here ..");
        System.out.println(s1+ "\t");

        List<String> s2 = new LinkedList<String>();
        s2.add("darshan");
        s2.add("darshan2");
        s2.add("darshan3");
        s2.add("darshan4");

        System.out.println("linked list is here ..");
        System.out.println(s2+ "\t");

    }
}
