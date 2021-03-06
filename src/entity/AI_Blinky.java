import java.awt.image.BufferedImage;


public class AI_Blinky extends Entity {

	// Constants
	
	// Members
	
	public AI_Blinky(BufferedImage[][] img, int spawnX, int spawnY, int[][] paths) {
		init(img,spawnX,spawnY, paths);
		setHome(-2,2);
		targetHome();
		
		scatterMode();
	}
	
	protected void tick(int timePassed, float ticks, Player p) {
		if (m_mode == MODE_SCATTER) {
			targetHome();
		} else if (m_mode == MODE_CHASE) {
			setTarget((int)(p.getX()),(int)(p.getY()));
		}
	}

}
