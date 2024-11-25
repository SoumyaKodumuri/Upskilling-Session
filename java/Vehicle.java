
 interface Vehicle {
public void vehiclesound();
public void vehiclefuel();
}

 class car implements Vehicle{
	public void vehiclesound() {
		System.out.println("engine sound of a car");
	}
	public void vehiclefuel() {
		System.out.println("fuel of a car");
	}
}
 class park{
	 public static void main(String[] args) {
		car c=new car();
		c.vehiclesound();
		c.vehiclefuel();
	}
 }