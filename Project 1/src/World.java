/* 433-294 Object Oriented Software Development
 * RPG Game Engine
 * Author: <Ambar Srivastava> <srivastavaa>
 */

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.tiled.TiledMap;

/** Represents the entire game world.
 * (Designed to be instantiated just once for the whole game).
 */
public class World
{
	private TiledMap map;
	private Image character;
	private Player player;
	private int xPos, yPos;
	private double deltaX, deltaY;
	private Camera playerCamera;
	
    /** Create a new World object. */
    public World()
    throws SlickException
    {
        // TODO: Fill in
    	player = new Player();
    	//playerCamera = new Camera(player, screenwidth, screenheight);
    }

    /** Update the game state for a frame.
     * @param dir_x The player's movement in the x axis (-1, 0 or 1).
     * @param dir_y The player's movement in the y axis (-1, 0 or 1).
     * @param delta Time passed since last frame (milliseconds).
     */
    public void update(double dir_x, double dir_y, int delta)
    throws SlickException
    {
        // TODO: Fill in
    	double deltaX = dir_x*0.25*delta;
    	double deltaY = dir_y*0.25*delta;
    	player.update(deltaX, deltaY);

    	
    }

    /** Render the entire screen, so it reflects the current game state.
     * @param g The Slick graphics object, used for drawing.
     */
    public void render(Graphics g)
    throws SlickException
    {
        // TODO: Fill in
    	map = new TiledMap("assets/map.tmx","assets/");
      	map.render(-72,-72,4,4,13,10);
      	
      	character = new Image("assets/units/player.png");
      	character.draw(360,252);
    }
}
