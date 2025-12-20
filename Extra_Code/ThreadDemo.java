import java.lang.Exception;
class OddTherad extends Thread{
	public void run(){
		System.out.println("All Odd numbers");
		for (int i =  1 ; i <=20 ; i++ ){
			if (i%2!=0){
				System.out.println(i);
			}
		}
	}
}
class  EvenThread extends Thread{
	public void run(){
		System.out.println("All Even numbers");
		for(int i = 1  ; i<= 20 ;i++){
			if(i%2==0){
				System.out.println(i);
			}
		}
	}
}

public class ThreadDemo{
	public static void main(String[] args) {

		try{
			OddTherad odd = new OddTherad();
			EvenThread even = new EvenThread();
			odd.start();
			even.start();

			odd.join();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}