package lab03.shapes;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.Before;
import org.junit.Test;


public class DrawableObjectListTest {
	Drawable d1;
	Drawable d2;
	Drawable d3;

	/**
	 * DrawableObject for the test fixture. This variable is a field and is thus available
	 * in all of the tests.
	 */
	private 	DrawableObjectList objList1;

	@Before
	public void setUp() throws Exception {
		/*
		 * Construct all of the objects being used in the test fixture here.
		 */
		objList1 = new DrawableObjectList();
		d1 = new Circle(0,0,1,Color.BLACK);
		d2 = new Circle(1,0,1,Color.MAGENTA);
		d3 = new Circle(-1,0,1,Color.DARK_GRAY);
	}

	@Test
	public void testZeroArgConstructo() {
		assertEquals("No DrawableOjectList is constructed", 0, objList1.getSize());
	}

	@Test
	public void testAddDrawable() {
		assertEquals("There is an object on the list", 0, objList1.getSize());
		objList1.addDrawable(d1);
		objList1.addDrawable(d2);
		objList1.addDrawable(d3);
		assertEquals("Not three objects on the list", 3, objList1.getSize());
	}

	@Test
	public void testRemoveDrawable() {
		objList1.addDrawable(d1);
		objList1.addDrawable(d2);
		objList1.addDrawable(d3);
		assertEquals("Not properly removing object", 3, objList1.getSize());
		objList1.removeDrawable(d1);
		assertEquals("Not properly removing object", 2, objList1.getSize());	
	}

	@Test
	public void testScaleAll() {
		objList1.addDrawable(d1);
		objList1.addDrawable(d2);
		objList1.addDrawable(d3);
		objList1.scaleAll(2.0);
		Circle c1 = (Circle) d1; 
		Circle c2 = (Circle) d2; 
		Circle c3 = (Circle) d3; 
		assertEquals("Not scaling correctly", 2, c1.getRadius());	
		assertEquals("Not scaling correctly", 2, c2.getRadius());	
		assertEquals("Not scaling correctly", 2, c3.getRadius());	
	}
}
