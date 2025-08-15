public class Exception {
        public static void main(String args[]) 
        {
            try 
            {
                System.out.print("A");
                throw new NullPointerException ("Hello");
            }
            catch(ArithmeticException e) 
            {
                System.out.print("B");        	
            }
        }

        public void printStackTrace() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'printStackTrace'");
        }
    }

