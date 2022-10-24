package ocp;

public class Main {

	public static void main(String args[]) {
		Square square1 = new Square(2, 3, 4, 5);
		//Square square2 = new Square(8, 9, 10, 11);
		Circle circle1 = new Circle(3, 4, 5);
		Circle circle2 = new Circle(1, 2, 3);
		Diamond diamond1 = new Diamond(3, 2, 2);
		
		Sheet sheet = new Sheet();
		sheet.addFigure(circle1);
		sheet.addFigure(circle2);
		sheet.addFigure(square1);
		sheet.addFigure(diamond1);
		
		sheet.drawFigures();
	}
}
