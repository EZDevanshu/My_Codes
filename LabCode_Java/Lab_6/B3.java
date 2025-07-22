// Define class for Complex number with real and imaginary as data members. Create its
// constructor, overload the constructors. Also define addition method to add two
// complex objects.

class ComplexNumber
{
     double realNumber ;
     double imaginary ;
     

     public ComplexNumber(double realNumber , double imaginary)
     {
        this.realNumber = realNumber;
        this.imaginary = imaginary;
     }

     
     public void addComplexNumber(ComplexNumber Num1)
     {
        realNumber = this.realNumber + Num1.realNumber;
        imaginary = this.imaginary + Num1.imaginary;

        System.out.println("Ans = " +realNumber+ " + " +imaginary+ "i");
     }

}


public class B3 
{
    public static void main(String [] args)
    {
       ComplexNumber num1 = new ComplexNumber(5, 9);
       ComplexNumber num2 = new ComplexNumber(10, 5);
       num2.addComplexNumber(num1);
    }
}
