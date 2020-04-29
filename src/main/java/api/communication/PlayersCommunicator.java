package api.communication;

import api.communication.api.GameMessage;

public interface PlayersCommunicator {
    void sendMessageToPlayer(GameMessage message, String playerID);
    void addPlayerToGame();
    void removePlayerFromGame();
}
