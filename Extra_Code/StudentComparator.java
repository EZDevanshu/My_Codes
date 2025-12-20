import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            if(o1.name==o2.name){
                return 0;
            }
            else if(o1.rollNo==o2.rollNo){
                return -1;
            }
            else{
                return 1;
            }
        }
}
