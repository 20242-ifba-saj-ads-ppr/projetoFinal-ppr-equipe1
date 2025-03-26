package core.models;

public abstract class BaseBoard {
    private final int width;
    private final int height;

    public BaseBoard(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public abstract void placePiece(Position position, BasePiece piece);
    public abstract BasePiece getPiece(Position position);
    public abstract void removePiece(Position position);
    public abstract boolean isCellOccupied(Position position);

    public boolean isValidPosition(Position position) {
        return position.x() >= 0 && position.x() < width && position.y() >= 0 && position.y() < height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }


}
