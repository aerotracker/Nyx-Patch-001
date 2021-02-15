# Nyx-Patch-001
Changing the vehicle behaviour during Player onQuit event.
there's a small abuse can be used during onQuit server using Boat and Villager.
### How to Reproduce
1) Take Villager on Boat
2) Player enter the boat
3) Use other account to trade the villager until the villager almost leveled up
4) The Player on the boat then disconnected while on the boat
5) Both Vehicle and Villager will disappear
6) The Player who Disconnected then Reconnect again
7) Repeat Step 3 - 6
8) Free Exp (and probably) cheaper trade on Villager

### What Changes ?
It rather simple to be honest
first it check during onQuit even are there any Passengger on Vehicle
if yes then eject both Player and Pasengger during onQuit event
if no then it only eject the player

Lot of Thanks to Player Koora A.K.A Zoglin for testing this 
