package ocp;

public class Square extends Figure{

	int x, y, l, z;
	
	public Square(int x, int y, int l, int z) {
		this.x = x;
		this.y = y;
		this.l = l;
		this.z = z;
	}
	
	public void draw() {
		System.out.println("Square " + x + ", " + y + ", " + l + ", " + z);
	}
	
	public String getArea() {
		return "Square area = " + (float) (l*z);
	}
}
