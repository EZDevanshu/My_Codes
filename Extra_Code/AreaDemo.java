        import java.util.Scanner;
        class Area{
            int radiud ;
            int length ;
            int width ;
            public void CircleArea(int radius)
            {
                double ans =0;
                ans = 3.14*radius*radius;
                System.out.println("Area of Circle : "+ans);
            }
            public void RactangleAre(int length , int width)
            {
                double ans =0 ;
                ans = length*width;
                System.out.println("Area of Ractangel : "+ans);
            }
            public void SquarArea(int length)
            {
                int ans = 0 ;
                ans = 4*length;
                System.out.println("Area od Squar : "+ans);
            }
        }
        public class AreaDemo 
        {
            public static void main(String [] args)
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter The radiud Of the circle : ");
                int radius = sc.nextInt();

                System.out.println("Enter the value of length : ");
                int length = sc.nextInt();

                System.out.println("Enter the value of Width : ");
                int width = sc.nextInt();

                Area s1 = new Area();
                s1.CircleArea(radius);

                Area s2 = new Area();
                s2.RactangleAre(length , width);

                Area s3 = new Area();
                s3.SquarArea(length);
                sc.close();
            }

        }
