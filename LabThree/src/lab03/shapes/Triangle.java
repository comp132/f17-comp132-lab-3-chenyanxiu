package lab03.shapes;

import java.awt.Color;
import java.awt.*;

public class Triangle implements Drawable, Scaleable{
	
	private int x;
    private int y;
    private int leg;
    private Color theColor;
    private boolean isVisible;
    
    /**
     * Construct a new Triangle centered at initX, initY with a radius of
     * initRadius and color indicated by initColor. The new Triangle is visible by
     * default.
     * 
     * @param initX the x coordinate of the center of the circle.
     * @param initY the y coordinate of the center of the circle.
     * @param initRadius the radius of the circle.
     * @param initColor the color of the circle.
     */
    public Circle(int initX, int initY, int initLeg, Color initColor) {
        x = initX;
        y = initY;
        leg = initLeg;
        theColor = initColor;
        isVisible = true;
    }
}
