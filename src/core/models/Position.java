package core.models;

public record Position(int x, int y) {

    public double distanceTo(Position position) {
        return Math.sqrt(Math.pow(position.x - this.x, 2) + Math.pow(position.y - this.y, 2));
    }

    public boolean isAdjacentTo(Position position) {
        return Math.abs(position.x - this.x) <= 1 && Math.abs(position.y - this.y) <= 1;
    }
}
