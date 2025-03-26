package core.models;

import core.enums.GameState;

import java.util.List;

public abstract class BaseGame {
    private GameState gameState;
    private final BaseBoard board;
    private final List<BasePiece> pieces;
    private final List<Player> players;
    private Player currentPlayer;

    public BaseGame(BaseBoard board, List<BasePiece> pieces, List<Player> players) {
        this.board = board;
        this.pieces = pieces;
        this.players = players;
        this.gameState = GameState.NOT_STARTED;
    }

    protected abstract void initialize();
    protected abstract void finish();

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

    public void end(){
        if(this.gameState == GameState.IN_PROGRESS){
            finish();
            this.gameState = GameState.FINISHED;
        }
    }

    public GameState getGameState() {
        return gameState;
    }


    public BaseBoard getBoard() {
        return board;
    }

    public List<BasePiece> getPieces() {
        return pieces;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }
}
