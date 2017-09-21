package lab03.shapes;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.Before;
import org.junit.Test;

public class RectangleTest {

	/**
	 * Rectangle for the test fixture. This variable is a field and is thus available
	 * in all of the tests.
	 */
	private 	Rectangle r1;

	@Before
	public void setUp() throws Exception {
		/*
		 * Construct all of the objects being used in the test fixture here.
		 */
		r1 = new Rectangle(0,2,3,2,Color.green);

	}

	@Test
	public void testFiveArgConstructor() {
		assertEquals("No Rectangle is constructed", 0, r1.getX());
		assertEquals("No Rectangle is constructed", 2, r1.getY());
		assertEquals("No Rectangle is constructed", 3, r1.getWidth());
		assertEquals("No Rectangle is constructed", 2, r1.getHeight());
		assertSame("No Rectangle is constructed", Color.green, r1.getColor());
	}

	@Test
	public void testSetWidth() {
		r1.setWidth(5);
		assertEquals("The width is not correct.", 5, r1.getWidth());
	}

	@Test
	public void testSetHeight() {
		r1.setHeight(6);
		assertEquals("The height is not correct.", 6, r1.getHeight());
	}

	@Test
	public void testMove() {
		r1.move(2,3);
		assertEquals("The rectangle does not move correctly", 2, r1.getX());
		assertEquals("The rectangle does not move correctly", 3, r1.getY());
	}

	@Test
	public void testTranslate() {
		r1.translate(2,3);
		assertEquals("The rectangle does not translate correctly", 2, r1.getX());
		assertEquals("The rectangle does not translate correctly", 5, r1.getY());
	}

	@Test
	public void testScale() {
		r1.scale(2.0);
		assertEquals("The rectangle does not scale correctly", 6, r1.getWidth());
		assertEquals("The rectangle does not scale correctly", 4, r1.getHeight());
	}

	@Test
	public void testSetColor() {
		r1.setColor(Color.CYAN);
		assertEquals("The rectangle's color does not change correctly", Color.CYAN, r1.getColor());
	}

	@Test
	public void testIsVisible() {
		assertTrue("The rectangle was not properly made visible", r1.isVisible());
	}

	@Test
	public void testSetVisible() {
		r1.setVisible(false);
		assertFalse("The rectangle was not changed to invisible", r1.isVisible());
	}
}
