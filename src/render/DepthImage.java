import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;


public class DepthImage extends DrawableImage {

	// Constants
	private static final Color BG = new Color(7,7,7);
	private static final float MAX_DEPTH = 3f, FALLOFF_LIMIT = 0.25f, MIN_ALPHA = 0.02f;
	
	// Members
	private float m_depth, m_df;
	private boolean m_back;
	
	public DepthImage(BufferedImage img, float x, float y, float w, float h, float depth) {
		this(img,x,y,w,h,depth,true);
	}
	
	public DepthImage(BufferedImage img, float x, float y, float w, float h, float depth, boolean back) {
		super(img, x, y, w, h);
		m_depth = depth;
		m_back = back;
		
		float t = (m_depth - FALLOFF_LIMIT);
		m_df = (float)Math.max(Math.min(Ease.cubeIn(t,1.0f,MIN_ALPHA-1.0f,MAX_DEPTH), 1f),MIN_ALPHA);
	}
	
	protected void drawContent(Graphics2D g) {
		if (m_back) {
			g.setColor(BG);
			g.fillRect((int) (m_x - m_ox), (int) (m_y - m_oy), (int) m_w, (int) m_h);
		}
		
		g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER,
				(float) m_df));
		g.drawImage(getImg(), (int) (m_x - m_ox), (int) (m_y - m_oy), (int) m_w,
				(int) m_h, null);
	}
	
	

}
