package ObjectOrientedP;

public class TestAutomobile {
	public static void main (String[] args){
		Automobile a = new Automobile();
		a.setColor("Black");
		a.setSpeed(50);
		a.setMake("Maruti");
		String c = a.getcolor();
		
		System.out.println("Car Maker: "+a.getMake());
		System.out.println("Color of car: "+ a.getcolor());
		System.out.println("Speed of car: "+a.getSpeed());
		
		
		}

}
