// Hierarichal Inheritance

class Father{
	void Height() {
		System.out.println("I am a Father class");
	}
}
 class son extends Father{
	void color() {
		System.out.println("I am a Son class");
	}
}
 class daughter extends Father{
	 void voice() {
		 System.out.println("I am a Daughter class");
	 }
 }

public class Hierarichal {
public static void main(String[] args) {
	daughter dd=new daughter();
	dd.voice();
	dd.Height();
	 son ss=new son();
	 ss.color();
	 ss.Height();
}
}
