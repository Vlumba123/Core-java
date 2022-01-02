package ObjectOrientedP;

public class Automobile {
	
	private String color;
	private int speed;
	private String make;
	public int NO_OF_GEARS;

	public void setColor (String color) {
		this.color = color;
	}
	public String getcolor() {
		return color;
	}
	public int getSpeed() {
		return speed;
		
	}
	public void setSpeed (int speed) {
		this.speed = speed;
		
		if (speed < 10 ) {
			System.out.println("1 gear: "+ speed);
			
		}
		else if (speed < 20 ) {
			System.out.println("2 gear: "+ speed);
			
		}
		else if (speed < 40 ) {
			System.out.println("3 gear: "+ speed);
			
		}

		else if (speed < 60 ) {
			System.out.println("4 gear: "+ speed);
			
		}

		else if (speed < 80 ) {
			System.out.println("fifth gear: "+ speed);
			
		}
		else  {
			System.out.println("sixth gear: "+ speed);
			
		}


	}
	
	public String getMake() {
		return make;
	}
	public void setMake (String make) {
		this.make = make;
	}
	public void setNO_OF_GEARS(int NO_OF_GEARS){
		this.NO_OF_GEARS = NO_OF_GEARS;
	}
	public int getNO_OF_GEARS() {
		return NO_OF_GEARS;
	}
	
}



