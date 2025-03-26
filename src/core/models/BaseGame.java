package core.models;

import core.enums.GameState;

public abstract class BaseGame {
    private GameState gameState;
    private final BaseBoard board;

    public BaseGame(BaseBoard board) {
        this.board = board;
        this.gameState = GameState.NOT_STARTED;
    }

    public abstract void initialize();

    public void start(){
        if(this.gameState == GameState.NOT_STARTED){
            initialize();
            this.gameState = GameState.IN_PROGRESS;
        }
    }

    public void pause(){
        if(this.gameState == GameState.IN_PROGRESS){
            this.gameState = GameState.PAUSED;
        }
    }

    public void resume(){
        if(this.gameState == GameState.PAUSED){
            this.gameState = GameState.IN_PROGRESS;
        }
    }
}
