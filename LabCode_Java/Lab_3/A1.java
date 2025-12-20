import java.util.Scanner;
public class A1 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
         double sum =0;

        for(int i=1 ; i<=5 ; i++ ){
            System.out.println("Enter Matrks of Subject "+i);
            int a=sc.nextInt();
            sum+=a;
        }  
        System.out.println("Tota Marks Out Of 500 is = "+sum);
         double p = sum/600*100;
        System.out.println("Persentage = "+p);
        if(p>60){
            System.out.println("First Divition");
        }
        else if(p>50&&p<59){
            System.out.println("second Divition");
        }
        else if(p>40&&p<49){
            System.out.println("Third Divition");
        }
        else if(p<40){
            System.out.println("Fail....");
        }
    }    
}
