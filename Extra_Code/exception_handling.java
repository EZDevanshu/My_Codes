
class exception_handling {
    public static void main(String args[]) 
        {
            try 
            {
                int a = args.length;
                int b = 10 / a;
                System.out.print(a);
                try 
                {
                    if (a == 1)
                        a = a / a - a;
                    if (a == 2) 
                    {
                        int []c = {1};
                        c[8] = 9;
                    }
                  

                }
                catch (ArrayIndexOutOfBoundsException e) 
                {
                    System.out.println("TypeA");
                }
                       }
                catch (ArithmeticException e) 
                {
                    System.out.println("TypeB");
                }
        
    }
}

// class exception_handling {
//     public static void main(String args[]) {
//         try {
//             int a = args.length;
//             int b = 10 / a; // Can cause ArithmeticException if a == 0
//             System.out.print(a);

//             try {
//                 if (a == 1)
//                     a = a / a - a;  // This will be 1 / 1 - 1 = 0 (no error)
//                 if (a == 2) {
//                     int[] c = {1};
//                     c[8] = 9;  // This causes ArrayIndexOutOfBoundsException
//                 }
//             }
//             catch (ArrayIndexOutOfBoundsException e) {
//                 System.out.println("TypeA");
//             }
//             catch (ArithmeticException e) {
//                 System.out.println("TypeB");
//             }
//         }
//         catch (ArithmeticException e) {
//             System.out.println("Division by zero (Outer catch)");
//         }
//     }
// }
