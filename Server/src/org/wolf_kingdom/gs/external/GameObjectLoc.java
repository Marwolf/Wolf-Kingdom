package org.wolf_kingdom.gs.external;

public class GameObjectLoc {
    /**
     * The direction it faces
     */
    public int direction;
    /**
     * The id of the gameObject
     */
    public int id;
    /**
     * Type of object - 0: Object, 1: WallObject
     */
    public int type;
    /**
     * The objects x coord
     */
    public int x;
    /**
     * The objects y coord
     */
    public int y;

    public GameObjectLoc(int id, int x, int y, int direction, int type) {
	this.id = id;
	this.x = x;
	this.y = y;
	this.direction = direction;
	this.type = type;
    }

    public int getDirection() {
	return direction;
    }

    public int getId() {
	return id;
    }

    public int getType() {
	return type;
    }

    public int getX() {
	return x;
    }

    public int getY() {
	return y;
    }
	
	/**
    * Object Ownership
    * @author Yong Min
    */
	public String owner = null;
   
	public GameObjectLoc(int id, int x, int y, int direction, int type, String owner) {
      this.id = id;
      this.x = x;
      this.y = y;
      this.direction = direction;
      this.type = type;
      this.owner = owner;
	}
   
	public String getOwner() {
      return owner;
	}
   
}
