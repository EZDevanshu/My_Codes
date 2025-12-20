
public class SubClass extends SuperClass{
    int a = 30 ;

    public void printA(){
        int a = 20;
        System.out.println("a = "+a);
        System.out.println("this.a = "+this.a);
        System.out.println("super.a = "+super.a);
    }
}
