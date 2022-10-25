package ocp;

public class Circle extends Figure{

	int x, y, z;
	
	public Circle(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public void draw() {
		System.out.println("Circle " + x + ", " + y + ", " + z);
	}
	
	public String getArea() {
		return "Circle area = " + (float) (Math.PI * z*z);
	}
}
