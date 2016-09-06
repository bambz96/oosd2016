/* SWEN20003 Object Oriented Software Development
 * RPG Game Engine
 * Author: Ambar Srivastava <srivastavaa> */
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Player {
	
    private int xPos = 360;
    private int yPos = 252;
	
	Image character;
	Camera playerCamera; 
	
	public void update(double deltaX, double deltaY)
    throws SlickException
    {
		xPos += deltaX;
		yPos += deltaY;
    }

	public int getxPos() {
		return xPos;
	}

	public int getyPos() {
		return yPos;
	}
	
	

}
