import java.util.HashMap;

public class HashMapDemo {
    public static void main(String args []){
        HashMap<Integer , Student> s1 = new HashMap<Integer , Student>();
        s1.put(101,new Student("meet" , 220));
        s1.put(102,new Student("ajit" , 230));
        s1.put(103,new Student("aryan" , 244));
        s1.put(104,new Student("ajay" , 245));
        s1.put(105, new Student("bhavik" , 270));

        System.out.println(s1.get(101).name);
    }
}
