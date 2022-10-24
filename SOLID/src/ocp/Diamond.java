package ocp;

public class Diamond extends Figure{

	int x, y, aldea;
	
	public Diamond(int aldea, int x, int y) {
		this.aldea = aldea;
		this.x = x;
		this.y = y;
	}
	
	public void draw() {
		System.out.println("Diamond " + x + ", " + y + ", " + aldea);
	}
}
