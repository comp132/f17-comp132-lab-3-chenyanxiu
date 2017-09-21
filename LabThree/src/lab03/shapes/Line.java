package lab03.shapes;

import java.awt.Color;
import java.awt.Graphics;
/**
 * A Line is an object representing a line. A line has a starting point (x1,y1) and an end 
 * point (x2,y2) as well as color. It can be moved, translated, scaled and drawn.
 * 
 * @author Yanxiu Chen, James O'Brien 
 * @author Dickinson College
 * @version Sep. 20th, 2017
 */

public class Line implements Drawable{
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	private Color theColor;
	private boolean isVisible;

	/**
	 * Construct a new Line starting at (x1,y1) and ends at (x2, y2) with a color indicated 
	 * by initColor. The new Line is visible by default.
	 * 
	 * @param initX1 the x coordinate of the starting point.
	 * @param initY1 the y coordinate of the starting point.
	 * @param initX2 the x coordinate of the ending point.
	 * @param initY2 the y coordinate of the ending point.
	 * @param initColor the color of the line.
	 */
	public Line(int initX1, int initY1, int initX2, int initY2, Color initColor) {
		x1 = initX1;
		y1 = initY1;
		x2 = initX2;
		y2 = initY2;
		theColor = initColor;
		isVisible = true;
	}


	/**
	 * Get the x coordinate of the starting point on the line.
	 * 
	 * @return the x1 coordinate
	 */
	public int getX1() {
		return x1;
	}

	/**
	 * Get the y coordinate of the starting point on the line.
	 * 
	 * @return the y1 coordinate
	 */
	public int getY1() {
		return y1;
	}

	/**
	 * Get the x coordinate of the ending point on the line.
	 * 
	 * @return the x2 coordinate
	 */
	public int getX2() {
		return x2;
	}

	/**
	 * Get the y coordinate of the ending point on the line.
	 * 
	 * @return the y2 coordinate
	 */
	public int getY2() {
		return y2;
	}

	/**
	 * Set the x coordinate of the starting point on the line.
	 * 
	 * @param newX1 the new x1 coordinate
	 */
	public void setX1(int newX1) {
		x1 = newX1;
	}

	/**
	 * Set the x coordinate of the ending point on the line.
	 * 
	 * @param newX2 the new x2 coordinate
	 */
	public void setX2(int newX2) {
		x2 = newX2;
	}

	/** 
	 * Set the y coordinate of the starting point on the line.
	 * 
	 * @param newY1 the new y1 coordinate
	 */
	public void setY1(int newY1) {
		y1 = newY1;
	}

	/** 
	 * Set the y coordinate of the ending point on the line.
	 * 
	 * @param newY2 the new y2 coordinate
	 */
	public void setY2(int newY2) {
		y2 = newY2;
	}

	/**
	 * Move the Line to a new location. This method changes both the starting and ending coordinates
	 * of the line using the values provided by the parameters.
	 * 
	 * @param newX1 the new x1 coordinate
	 * @param newY1 the new y1 coordinate
	 * @param newX2 the new x2 coordinate
	 * @param newY2 the new y2 coordinate
	 * 
	 */
	public void move(int newX1, int newY1, int newX2, int newY2) {
		x1 = newX1;
		y1 = newY1;
		x2 = newX2;
		y2 = newY2;
	}

	// === Implementation of the Drawable interface ===

	/**
	 * Draw this DrawableLine onto the specified Graphics object.
	 * 
	 * @param g the Graphics object on which to draw this DrawableLine.
	 */
	public void draw(Graphics g) {
		g.setColor(getColor());
		g.drawLine(getX1(), getY1(), getX2(), getY2());
	}

	/**
	 * Get the Color of this Line.
	 * 
	 * @return the color.
	 */
	public Color getColor() {
		return theColor;
	}

	/**
	 * Change the color of this Line to the newColor.
	 * 
	 * @param newColor the new color.
	 */
	public void setColor(Color newColor) {
		theColor = newColor;
	}

	/**
	 * Set whether or not this Line will be visible. If it is visible its draw
	 * method will be invoked when the DrawingTablet is repainted. If it is not
	 * visible its draw method will not be invoked.
	 * 
	 * @param visible true to make this Line visible, false to make it
	 *            invisible.
	 */
	public void setVisible(boolean visible) {
		isVisible = visible;
	}

	/**
	 * Find out if this Line is visible or not.
	 * 
	 * @return true if the Line is visible, false if it is not.
	 */
	public boolean isVisible() {
		return isVisible;
	}


}
