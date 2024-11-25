  
      //method overriding
   //parent class
  class Animal {
   public void sound() {
	   System.out.println("Animal makes Sounds...");
   }
   protected void eats() {
	   System.out.println("Animal eats");
   }
}
  //child class
class dog extends Animal{
	public void sound() {
		System.out.println("Dog sounds Bow Bow..");
	}
	protected void eats() {
		System.out.println("Dog eats biscuits");
	}
}
public class demo{
	public static void main(String[] args) {
		dog d= new dog();
		d.sound();
		d.eats();
		
	}
}
