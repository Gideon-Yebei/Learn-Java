package cloud.yebei.advancedjava.insidejava.javatools.javadoc;

/**
 * Represents the class of two-dimensional geometrical points.
 *
 * <p>Points are immutable, their coordinates cannot be changed after they are created.</p>
 *
 * <p>Example:
 * <pre>
 *     Point p = new Point(3, 4);
 *     System.out.println(p.getX()); // 3
 *     System.out.println(p.getY()); // 4
 *     System.out.println(p); // Point{x=3, y=4}
 * </pre>
 */
public class Point {
	private final int x;
	private final int y;

	/**
	 * Constructs a point with the given x and y coordinates.
	 *
	 * @param x the x coordinate of the point
	 * @param y the y coordinate of the point
	 */
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Returns a string representation of the point.
	 *
	 * @return a string representation of the point
	 */
	public int getY() {
		return y;
	}

	/**
	 * Returns x coordinate of the point
	 *
	 * @return x coordinate of the point
	 */
	public int getX() {
		return x;
	}
}