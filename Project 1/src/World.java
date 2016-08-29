/* 433-294 Object Oriented Software Development
 * RPG Game Engine
 * Author: <Ambar Srivastava> <srivastavaa>
 */

import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.tiled.TiledMap;

/** Represents the entire game world.
 * (Designed to be instantiated just once for the whole game).
 */
public class World
{
	private TiledMap map;
    /** Create a new World object. */
    public World()
    throws SlickException
    {
        // TODO: Fill in
    	map = new TiledMap("assets/map.tmx","assets/");
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
    }

    /** Render the entire screen, so it reflects the current game state.
     * @param g The Slick graphics object, used for drawing.
     */
    public void render(Graphics g)
    throws SlickException
    {
        // TODO: Fill in
      	map.render(756, 684, 1000, 1000, 13, 10);
 
    }
}
