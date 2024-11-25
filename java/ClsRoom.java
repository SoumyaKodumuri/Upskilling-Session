
public class ClsRoom {
	
	int Chair= 5;
   public void count() {   //method overloading
	   Chair++;
	   System.out.println("count of chairs: " +Chair);
   }
   public void count(int a) {
	  System.out.println("Chairs");
   }

	public static void main(String[] args) {
     ClsRoom clr= new ClsRoom();
     clr.count();
     //clr.count();
     clr.count(4);
	}

}
