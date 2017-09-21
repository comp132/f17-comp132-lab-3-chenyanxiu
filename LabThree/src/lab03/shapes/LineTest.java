package lab03.shapes;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.Before;
import org.junit.Test;

public class LineTest {

	/**
	 * Line for the test fixture. This variable is a field and is thus available
	 * in all of the tests.
	 */
	private 	Line l1;

	@Before
	public void setUp() throws Exception {
		/*
		 * Construct all of the objects being used in the test fixture here.
		 */
		l1 = new Line(0,0,1,1,Color.black);
		
	}

	@Test
	public void testFiveArgConstructor() {
		assertEquals("X1 is not correct", 0, l1.getX1());
		assertEquals("Y1 is not correct", 0, l1.getY1());
		assertEquals("X2 is not correct", 1, l1.getX2());
		assertEquals("Y2 is not correct", 1, l1.getY2());
		assertSame("The color is not correct", Color.black, l1.getColor());
	}
	
	@Test
	public void testSetX1() {
		l1.setX1(1);
		assertEquals("The x1 is not correct.", 1, l1.getX1());
	}
	
	@Test
	public void testSetX2() {
		l1.setX2(2);
		assertEquals("The x2 is not correct.", 2, l1.getX2());
	}
	
	@Test
	public void testSetY1() {
		l1.setY1(1);
		assertEquals("The y1 is not correct.", 1, l1.getY1());
	}
	
	@Test
	public void testSetY2() {
		l1.setY2(2);
		assertEquals("The y2 is not correct.", 2, l1.getY2());
	}
	
	@Test
	public void testMove() {
		l1.move(2,2,3,3);
		assertEquals("The line does not move correctly", 2, l1.getX1());
		assertEquals("The line does not move correctly", 2, l1.getY1());
		assertEquals("The line does not move correctly", 3, l1.getX2());
		assertEquals("The line does not move correctly", 3, l1.getY2());
	}
	
	@Test
	public void testSetColor() {
		l1.setColor(Color.CYAN);
		assertEquals("The line's color does not change correctly", Color.CYAN, l1.getColor());
	}
	
	@Test
	public void testIsVisible() {
		assertTrue("The line was not properly made visible", l1.isVisible());
	}
	
	@Test
	public void testSetVisible() {
		l1.setVisible(false);
		assertFalse("The line was not changed to invisible", l1.isVisible());
	}
	
}
