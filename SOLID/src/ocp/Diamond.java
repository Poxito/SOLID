package ocp;

public class Diamond extends Figure{

	int x, y, aldea, altuera, zabalera;
	
	public Diamond(int aldea, int x, int y, int altuera, int zabalera) {
		this.aldea = aldea;
		this.x = x;
		this.y = y;
		this.altuera = altuera;
		this.zabalera = zabalera;
	}
	
	public void draw() {
		System.out.println("Diamond " + x + ", " + y + ", " + aldea);
	}
	
	public String getArea() {
		return "Diamond area = " + (float) ((altuera * zabalera) / 2.0);
	}
}
