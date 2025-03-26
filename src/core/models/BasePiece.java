package core.models;

import core.utils.IdGenerator;

import java.util.Objects;

public abstract class BasePiece {
    private final String id;

    private Position position;

    BasePiece(Position position) {
        this.id = IdGenerator.randomId();
        this.position = position;
    }

    public String getId() {
        return id;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BasePiece basePiece = (BasePiece) o;
        return Objects.equals(id, basePiece.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
