package org.incubyte;

public class Chandrayaan {

    private int x, y, z;
    private Direction facingDirection;

    public Chandrayaan(int x, int y, int z, Direction facingDirection) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.facingDirection = facingDirection;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public Direction getFacingDirection() {
        return facingDirection;
    }

    public void setFacingDirection(Direction facingDirection) {
        this.facingDirection = facingDirection;
    }
}
