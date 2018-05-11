
public class Main {

	public static void main(String[] args) {

		Circle c1 = new Circle("red", 3.13);
		/*c1.color = "red";
		c1.radius = 3.13;*/
		Circle c2 = new Circle();
		c2.color = "blue";
		c2.radius = 3.5;
		Circle c3 = new Circle();
		//c3.color = "black";
		//c3.radius = 5.5;
		Circle c4 = new Circle();
		c4.color = "yellow";
		c4.radius = 10.15;
 
		System.out.println(c4);
		System.out.println(c4.toString());//sitas ir tas pats, kas vnk c1 bez toString
		System.out.println("c2 has color= " + c2.color + " and radius= " + c2.radius);
		System.out.println("c3 has color= " + c3.color + " and radius= " + c3.radius);
		//System.out.println("c4 has color= " + c4.color + " and radius= " + c4.radius);
	}

}
