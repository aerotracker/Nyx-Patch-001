package net.nyx.patch001;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class BoatPatch implements Listener {

    @EventHandler
    public void onQuit(final PlayerQuitEvent e){
        Player player = e.getPlayer();
        if (player.isInsideVehicle() && player.getPassengers() == null) {
            player.getVehicle().leaveVehicle();
        }
        else if (player.isInsideVehicle() && player.getPassengers() != null){
            player.getVehicle().eject();
            player.getVehicle().leaveVehicle();
        }
    }
}


