//single inheritance

public class single_inherit {
    public void classA() {
    	//System.out.println("I belongs to class A method");
    }
}
class clsB extends single_inherit{
	public void classB() {
		//System.out.println("I belongs to class B method");
	}
}
class demo2{
	public static void main(String[] args) {
	//	clsB b=new clsB();
	//	b.classA();
	//	b.classB();
		
		month m=month.FEBRAURAY;
		System.out.println(m.getType());
		}
}