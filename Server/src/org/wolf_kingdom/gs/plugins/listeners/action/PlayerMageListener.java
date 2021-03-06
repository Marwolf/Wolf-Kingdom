package org.wolf_kingdom.gs.plugins.listeners.action;

import org.wolf_kingdom.gs.model.Player;

public interface PlayerMageListener {
	/**
	 * Called when you mage a Player
	 * @param player Player that mages another player
	 * @param affectedPlayer Player that has been maged by our player
	 * @param spell Spell that was cast by our player on another player
	 */
	public void onPlayerMage(Player player, Player affectedPlayer, Integer spell);
}
