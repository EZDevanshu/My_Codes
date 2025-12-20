
// Create a class which ask the user to enter a sentence, and it should display count of
// each vowel type in the sentence. The program should continue till user enters a word
// “quit”. Display the total count of each vowel for all sentences.

import java.util.Scanner;

public class B1 {
    public static void main(String []args){
        Scanner sc =  new Scanner(System.in);
        int  counta = 0 ,counte = 0 ,counti = 0 ,counto = 0 ,countu = 0 ,countA = 0 ,countE = 0 ,countI = 0 ,countO = 0 ,countU = 0 ;
          while(true)
          {
            System.out.println("Enter a String ");
            String str = sc.nextLine();
            for (int i =0 ; i < str.length() ; i++)
            {
                char ch = str.charAt(i);
                if (ch == 'a')
                {
                    counta++;
                }
                else if(ch == 'e')
                {
                    counte++ ;
                }
                else if(ch == 'i')
                {
                    counti++ ;
                }else if(ch == 'o')
                {
                    counto++ ;
                }else if(ch == 'u')
                {
                    countu++ ;
                }else if(ch == 'A')
                {
                    countA++ ;
                }else if(ch == 'E')
                {
                    countE++ ;
                }else if(ch == 'I')
                {
                    countI++ ;
                }else if(ch == 'O')
                {
                    countO++ ;
                }
                else if(ch == 'U')
                {
                    countU++ ;
                }
            }
             if(str.equals("quit") )
            {
                break; 
            
            } 
      
          System.out.println("num of A  is = "+countA+ " E :" +countE+ " I :" +countI+ " O :" +countO+ " U :" +countU+ " I :" +countI+ " num of a  is = "+counta+ " e : " +counte+ " i  :" +counti+ " o : " +counto+ " u :" +countu+ " i : " +counti );            
          }
          sc.close();
      }
    }
