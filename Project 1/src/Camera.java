/* SWEN20003 Object Oriented Software Development
 * RPG Game Engine
 * Author: Ambar Srivastava <srivastavaa>
 */

import org.newdawn.slick.SlickException;

/** Represents the camera that controls our viewpoint.
 */
public class Camera
{

    /** The unit this camera is following */
    private Player unitFollow;
    
    /** The width and height of the screen */
    /** Screen width, in pixels. */
    public final int screenwidth;
    /** Screen height, in pixels. */
    public final int screenheight;

    
    /** The camera's position in the world, in x and y coordinates. */
    private int xPos;
    private int yPos;

    
    public int getxPos() {
        // TO DO: Fill In
    	return this.xPos;
    }

    public int getyPos() {
        // TO DO: Fill In
    	return this.yPos;
    }

    
    /** Create a new World object. */
    public Camera(Player player, int screenwidth, int screenheight)
    {   
        // TO DO: Fill In
    	this.unitFollow = player; 
    	this.screenwidth = screenwidth;
    	this.screenheight = screenheight;
    }

    /** Update the game camera to recentre it's viewpoint around the player 
     */
    public void update()
    throws SlickException
    {
        // TO DO: Fill In
    }
    
    /** Returns the minimum x value on screen 
     */
    public int getMinX(){
        // TO DO: Fill In
    	
    }
    
    /** Returns the maximum x value on screen 
     */
    public int getMaxX(){
        // TO DO: Fill In
    }
    
    /** Returns the minimum y value on screen 
     */
    public int getMinY(){
        // TO DO: Fill In
    }
    
    /** Returns the maximum y value on screen 
     */
    public int getMaxY(){
        // TO DO: Fill In
    }

    /** Tells the camera to follow a given unit. 
     */
    public void followUnit(Object unit)
    throws SlickException
    {
        // TO DO: Fill In
    }
    
}