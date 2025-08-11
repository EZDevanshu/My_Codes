import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;

public class ListDemo {
    public static void main(String [] args){
        List<Student> s1 = new LinkedList<Student>();
        s1.add(new Student("Devanshu", 101));  
        s1.add(new Student("Devanshu1", 105));  
        s1.add(new Student("Devanshu2", 104));  
        s1.add(new Student("Devanshu3", 103)); 
        
        Collections.sort( s1 , new StudentComparator()); 
        Iterator<Student> i = s1.iterator();
 
        while(i.hasNext()){
            System.out.println(i.next().name);
        }

    }
}
