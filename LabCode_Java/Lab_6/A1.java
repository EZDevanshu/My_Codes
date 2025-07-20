import java.util.Scanner;
class Circle{
      public double Area(int redius){
            return Math.PI*redius*redius;
      }
  }
public class A1{
      public static void main(String [] args){
          Scanner sc = new Scanner(System.in);
          Circle cr=new Circle();
          System.out.println("Enter radius");
          int radius = sc.nextInt();

          double area = cr.Area(radius);

         System.out.println("area :" +area);

         sc.close();
      }
}