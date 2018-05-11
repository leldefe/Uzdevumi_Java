
public class Circle {
	
	
	//Constant
	static final double PI=3.14159265;
	
	//Fields
	double radius;
	String color;
	
	//Konstruktors pastaisits
	
	public Circle(String crl, double rad) {
		
		radius = rad;
		color = crl;
	}
	public Circle () {
		color = " black";
	}
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]"; //Source + generate to string un java pati taisa lietas
	}

	/*// Source + generate constructor
	public Circle(double radius, String color) {
		super();
		this.radius = radius;
		this.color = color;
	}*/
	
	
	/*public String toString() {
		return "Circle{color=" + color +" and radius= " + radius+ "}";
	}*/

}
