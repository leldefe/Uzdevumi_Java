
public class Rectangle {

	double length;
	double width;
	
	public Rectangle() {

	}

	public Rectangle(double L) {
		length = L;
		width = L;
	}

	public Rectangle(double L, double W) {

		length = L;
		width = W;
	}

	public boolean isSquare() {
		
		return length==width;
		/*boolean isSquare = true;
		if (width != length) {
			isSquare=false;
		}
		return true;*/
		
	}

	public double area() {
		double area = length*width;
		return area;
	}

	public double perimeter() {
		double perimeter = (2*length)+(2*width);
		return perimeter;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + ", isSquare()=" + isSquare() + ", area()=" + area()
				+ ", perimeter()=" + perimeter() + "]";
	}

	

	

	
}
