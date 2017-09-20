package lab03.shapes;

import java.awt.Color;
import java.awt.Graphics;
/**
 * A Rectangle is an object representing a rectangle. A Rectangle has a center point
 * (x,y), a width, a height and a color. It can be moved, translated, scaled and drawn.
 * 
 * @author Yanxiu Chen, James O'Brien 
 * @author Dickinson College
 * @version Sep. 20th, 2017
 */

public class Rectangle {
	private int x;
    private int y;
    private int width;
    private int height;
    private Color theColor;
    private boolean isVisible;
    
    /**
     * Construct a new Rectangle centered at initX, initY with a width of initWidth as well
     * as a height of initHeight and color indicated by initColor. The new Rectangle is 
     * visible by default.
     * 
     * @param initX the x coordinate of the center of the rectangle.
     * @param initY the y coordinate of the center of the rectangle.
     * @param initWidth the width of the rectangle.
     * @param initHeight the height of the rectangle.
     * @param initColor the color of the rectangle.
     */
    public Rectangle(int initX, int initY, int initWidth, int initHeight, Color initColor) {
        x = initX;
        y = initY;
        width = initWidth;
        height = initHeight;
        theColor = initColor;
        isVisible = true;
    }
    
    /**
     * Get the x coordinate of the center of this Rectangle.
     * 
     * @return the x coordinate
     */
    public int getX() {
        return x;
    }

    /**
     * Get the y coordinate of the center of this Rectangle.
     * 
     * @return the y coordinate
     */
    public int getY() {
        return y;
    }

    /**
     * Get the width of the Rectangle.
     * 
     * @return the width
     */
    public int getWidth() {
        return width;
    }
    
    /**
     * Get the height of the Rectangle.
     * 
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * Set the width of this Rectangle. The Rectangle's width is set to the absolute
     * value of the specified width to eliminate any negative width values.
     * 
     * @param newWidth the width of the new rectangle.
     */
    public void setWidth(int newWidth) {
        width = Math.abs(newWidth);
    }
    
    /**
     * Set the height of this Rectangle. The Rectangle's height is set to the absolute
     * value of the specified height to eliminate any negative height values.
     * 
     * @param newHeight the height of the new rectangle.
     */
    public void setHeight(int newHeight) {
        height = Math.abs(newHeight);
    }

    /**
     * Move the Rectangle to a new location. This method changes the center point
     * of the rectangle using the values provided by the parameters.
     * 
     * @param newX the new x coordinate
     * @param newY the new y coordinate
     */
    public void move(int newX, int newY) {
        x = newX;
        y = newY;
    }
    
    /**
     * Move the Rectangle relative to its current location. The center of the
     * rectangle is moved by adding the parameters to the Rectangle's current
     * location.
     * 
     * @param deltaX the change in the x coordinate. Positive values move the
     *            Rectangle to the right, negative values move it to the left.
     * @param deltaY the change in the y coordinate. Positive values move the
     *            Rectangle down, negative values move it up.
     */
    public void translate(int deltaX, int deltaY) {
        x = x + deltaX;
        y = y + deltaY;
    }
    
 // === Implementation of the Scaleable interface ===
    /**
     * Scale this Rectangle by the specified factor. For example a factor of 2.0
     * will make the height and width twice as big and a factor of 0.5 will make them half
     * as large. If the factor is negative the height and width are not changed.
     * 
     * @param factor the factor by which this Rectangle is to be scaled.
     */
    public void scale(double factor) {
        if (factor > 0) {
            width = (int) (Math.round(width * factor));
            height = (int) (Math.round(height * factor));
        }
    }
    
 // === Implementation of the Drawable interface ===

    /**
     * Draw this DrawableRectangle onto the specified Graphics object.
     * 
     * @param g the Graphics object on which to draw this DrawableRectangle.
     */
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillOval(getX() - radius, getY() - radius, 2 * radius, 2 * radius);
    }

    /**
     * Get the Color of this Circle.
     * 
     * @return the color.
     */
    public Color getColor() {
        return theColor;
    }

    /**
     * Change the color of this Circle to the newColor.
     * 
     * @param newColor the new color.
     */
    public void setColor(Color newColor) {
        theColor = newColor;
    }

    /**
     * Set whether or not this Circle will be visible. If it is visible its draw
     * method will be invoked when the DrawingTablet is repainted. If it is not
     * visible its draw method will not be invoked.
     * 
     * @param visible true to make this Circle visible, false to make it
     *            invisible.
     */
    public void setVisible(boolean visible) {
        isVisible = visible;
    }

    /**
     * Find out if this Circle is visible or not.
     * 
     * @return true if the Circle is visible, false if it is not.
     */
    public boolean isVisible() {
        return isVisible;
    }
    
}
