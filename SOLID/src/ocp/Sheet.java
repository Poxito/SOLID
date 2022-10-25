package ocp;

import java.util.Enumeration;
import java.util.Vector;

public class Sheet {

	//Vector<Square> squares = new Vector<Square>();
	//Vector<Circle> circles = new Vector<Circle>();
	
	Vector<Figure> figures = new Vector<Figure>();
	
	/*public void addCircle(Circle c){
		circles.add(c);
	}
	
	public void addSquare(Square s){
		squares.add(s);
	}*/
	
	public void addFigure(Figure f){
		figures.add(f);
	}
	
	public void drawFigures(){
		/*Enumeration<Square> esquares = squares.elements();
		Square s;
		while (esquares.hasMoreElements()){
			s=esquares.nextElement();
			s.draw();
		}
		Enumeration<Circle> ecircles = circles.elements();
		Circle c;
		while (ecircles.hasMoreElements()){
			c = ecircles.nextElement();
			c.draw();
		}*/
		Enumeration<Figure> efigures = figures.elements();
		Figure f;
		while (efigures.hasMoreElements()){
			f = efigures.nextElement();
			f.draw();
		}
		
	}
	
	public void getAllAreas() {
		Enumeration<Figure> efigures = figures.elements();
		Figure f;
		while (efigures.hasMoreElements()){
			f = efigures.nextElement();
			System.out.println(f.getArea());
		}
	}
}
