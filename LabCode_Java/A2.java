// Define Time class with constructor to initialize hour and minute. Also define addition
// method to add two time objects
class Time{
    int hour ; 
    int minute ;

    public Time(int hour , int minute ){
         this.hour = hour ;
         this.minute = minute ;

    }

    public Time addition(Time temp){
         Time ans = new Time(0,0);
         ans.hour = this.hour + temp.hour ;
         ans.minute = this.minute + temp.minute;
         if (ans.minute > 60 ){
           ans.hour += 1;
           ans.minute -= 60 ;
         } 
         return ans ;
    }
    public void printTime(){
        System.out.println("Hour = " +hour+ " Minute = " +minute);
    }

}
   
public class A2 {
    public static void main(String []args){
      
        Time t1 = new Time(10,20);
        Time t2 = new Time(5,60);
  
        Time addTime = t2.addition(t1);
        addTime.printTime();
         
    }
}
