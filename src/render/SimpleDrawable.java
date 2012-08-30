import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

/**
 * Handles basic data handling for any drawable object
 * 
 * @author Joss
 * 
 */
public abstract class SimpleDrawable {

	// Constants
	protected static final AffineTransform NULL_TRANSFORM = new AffineTransform();
	
	// Members
	protected double m_x, m_y, m_w, m_h, m_ox, m_oy;

	/**
	 * Abstract constructor
	 * 
	 * @param x
	 *            The x val
	 * @param y
	 *            The y val
	 * @param w
	 *            The width
	 * @param h
	 *            The height
	 * @param ox
	 *            The x origin
	 * @param oy
	 *            The y origin
	 */
	protected SimpleDrawable(double x, double y, double w, double h, double ox,
			double oy) {
		m_x = x;
		m_y = y;
		m_w = w;
		m_h = h;
		m_ox = ox;
		m_oy = oy;
	}

	/**
	 * All drawable objects must accept a draw call
	 * 
	 * @param g
	 *            The graphics object to draw on
	 */
	public abstract void draw(Graphics2D g);

	/**
	 * Sets XY
	 * 
	 * @param v
	 *            The desired value
	 */
	public void setXY(double x, double y) {
		m_x = x;
		m_y = y;
	}

	/**
	 * Sets X
	 * 
	 * @param v
	 *            The desired value
	 */
	public void setX(double v) {
		m_x = v;
	}

	/**
	 * Gets X
	 * 
	 * @return The value
	 */
	public double getX() {
		return m_x;
	}

	/**
	 * Sets Y
	 * 
	 * @param v
	 *            The desired value
	 */
	public void setY(double v) {
		m_y = v;
	}

	/**
	 * Gets Y
	 * 
	 * @return The value
	 */
	public double getY() {
		return m_y;
	}

	/**
	 * Sets W
	 * 
	 * @param v
	 *            The desired value
	 */
	public void setW(double v) {
		m_w = v;
	}

	/**
	 * Gets W
	 * 
	 * @return The value
	 */
	public double getW() {
		return m_w;
	}

	/**
	 * Sets H
	 * 
	 * @param v
	 *            The desired value
	 */
	public void setH(double v) {
		m_h = v;
	}

	/**
	 * Gets H
	 * 
	 * @return The value
	 */
	public double getH() {
		return m_h;
	}

	/**
	 * Sets OX
	 * 
	 * @param v
	 *            The desired value
	 */
	public void setOX(double v) {
		m_ox = v;
	}

	/**
	 * Gets OX
	 * 
	 * @return The value
	 */
	public double getOX() {
		return m_ox;
	}

	/**
	 * Sets OY
	 * 
	 * @param v
	 *            The desired value
	 */
	public void setOY(double v) {
		m_oy = v;
	}

	/**
	 * Gets OY
	 * 
	 * @return The value
	 */
	public double getOY() {
		return m_oy;
	}

}
