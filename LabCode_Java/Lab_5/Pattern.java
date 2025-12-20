
public class Pattern {
    public static void main(String [] args){
        String  str = "string" ; 
        for (int i = 0 ; i<= str.length(); i++  ){
              for (int j =0 ; j<=i ; j++){
                // char ch = str.charAt(i);
                System.out.print(str.charAt(j)+" ");
              }
              System.out.println("");
        }
    }
}
