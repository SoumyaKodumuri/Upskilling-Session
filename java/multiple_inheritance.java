//Multiple Inheritance
interface classA{
	void show() ;
}
interface classB{
	void display();
}
class classC implements classA,classB{
	public void show() {
		System.out.println("I'm inherited from classA");
	}
	public	void display() {
		System.out.println("I'm inherited from classB");
	}
}

public class multiple_inheritance {
	public static void main(String[] args) {

	classC cc= new classC();
	cc.show();
	cc.display();
}

}
