package lec09_03_java_enumeration;

public class Shirt {
	// chart is the variable name which is Size type [Enum type]
	Size chart;

	// we wrote default constructor because , 
	// this is a norm when we create parameterized constructor line 13
	public Shirt () {
		
	}
	
	public Shirt(Size chart) {
		super();
		this.chart = chart;
	}
	
	public void findMyShirtSize() {
		
		switch(chart){
		
		case SMALL:
			System.out.println("Small size Shirt is selected by the user");
			break;
		
		case MEDIUM:
			System.out.println("Medium size Shirt is selected by the user");
			break;
		
		case LARGE:
			System.out.println("Large size Shirt is selected by the user");
			break;
		
		case XLARGE:
			System.out.println("Extra Large size Shirt is selected by the user");
			break;
			
		}
		
	}

}
