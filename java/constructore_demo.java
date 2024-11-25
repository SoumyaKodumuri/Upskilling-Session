
public class constructore_demo {
	int a;
	public constructore_demo() {
		a=5;
		
	}
	public constructore_demo(int a) {
		this.a=a;
	}
	public static void main(String[] args) {
		constructore_demo cd = new constructore_demo(3);
		System.out.println(cd);
	}

}
