
abstract class ab_class {  //abstract class
abstract void view();   //abstract method
public void display() {       //normal method
	System.out.println("im a display method");
}

}
 class audio extends ab_class{
	public void view() {
		System.out.println("im a view method of abstract class");
	}
}
 class video{
	 public static void main(String[] args) {
		audio au= new audio();
		au.view();
		au.display();
	}
 }