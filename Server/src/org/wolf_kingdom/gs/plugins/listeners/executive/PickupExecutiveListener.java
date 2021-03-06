package org.wolf_kingdom.gs.plugins.listeners.executive;

import org.wolf_kingdom.gs.model.InvItem;
import org.wolf_kingdom.gs.model.Player;

public interface PickupExecutiveListener {
	/**
	 * Return true if you wish to prevent a user from picking up an item
	 * @param p Player we do not want picking up an item
	 * @param i Item we do not want the player picking up
	 */
	public boolean blockPickup(Player p, InvItem i);
}
