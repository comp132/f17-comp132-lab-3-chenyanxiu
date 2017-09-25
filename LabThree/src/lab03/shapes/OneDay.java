package lab03.shapes;

import java.awt.Color;

/**
 * A typical day for a stick person. He or she first comes out from home to work. 
 * As the days goes by, the sun pulses. When the moon comes out, the person finishes 
 * his or her work and finally comes home.
 *
 * @author Yanxiu Chen, James O'Brien 
 * @author Dickinson College
 * @version Sep. 20th, 2017
 */

public class OneDay {
	/**
	 * Display a figure coming out from a house to work when the sun rises; 
	 * then the sun changes as the day passes by. At dusk, the figure comes back to the house. 
	 * A great day!
	 * 
	 * @param args none
	 */
	public static void main(String[] args) {
		DrawableObjectList objList = new DrawableObjectList();
		DrawingTablet tablet = new DrawingTablet("OneDay", 200, 200, objList);

		// A person to move horizontally across the tablet.
		Circle head = new Circle(55, 178, 4, Color.yellow);
		Line body = new Line (55,182,55,192,Color.BLACK);
		Line arms = new Line (51,186, 59, 186, Color.BLACK);
		Line leftLeg = new Line (51,200,55,192,Color.black);
		Line rightLeg = new Line (55,192,59,200,Color.BLACK);
		objList.addDrawable(head);
		objList.addDrawable(body);
		objList.addDrawable(arms);
		objList.addDrawable(leftLeg);
		objList.addDrawable(rightLeg);

		// Create a house
		Rectangle house = new Rectangle(0, 125, 50, 75, Color.blue);
		Rectangle door = new Rectangle(28, 170, 12, 30, Color.white); 
		objList.addDrawable(house);
		objList.addDrawable(door);

		// Create a sun
		Circle sun = new Circle(125, 30, 20, Color.ORANGE);
		objList.addDrawable(sun);
		tablet.repaint();

		//the sun pulses and the person leaves the house 
		for (int i = 0; i < 20; i++) {
			sun.scale(0.85);
			head.translate(5, 0);    
			arms.move(arms.getX1()+5, arms.getY1(), arms.getX2()+5, arms.getY2());
			body.move(body.getX1()+5, body.getY1(), body.getX2()+5, body.getY2());
			rightLeg.move(rightLeg.getX1()+5, rightLeg.getY1(), rightLeg.getX2()+5, rightLeg.getY2());
			leftLeg.move(leftLeg.getX1()+5, leftLeg.getY1(), leftLeg.getX2()+5, leftLeg.getY2());
			tablet.repaint();
			AnimationTimer.sleep(70);
		}
		for (int i = 0; i < 15; i++) {
			sun.scale(1.18);
			tablet.repaint();
			AnimationTimer.sleep(70);
		}
		
		//the moon comes out 
		sun.setColor(Color.LIGHT_GRAY);

		//the person comes home
		for (int i = 0; i < 30; i++) {
			head.translate(-5, 0);    
			arms.move(arms.getX1()-5, arms.getY1(), arms.getX2()-5, arms.getY2());
			body.move(body.getX1()-5, body.getY1(), body.getX2()-5, body.getY2());
			rightLeg.move(rightLeg.getX1()-5, rightLeg.getY1(), rightLeg.getX2()-5, rightLeg.getY2());
			leftLeg.move(leftLeg.getX1()-5, leftLeg.getY1(), leftLeg.getX2()-5, leftLeg.getY2());
			tablet.repaint();
			AnimationTimer.sleep(70);
		}
	}

}
