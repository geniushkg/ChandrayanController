package org.incubyte;

import static org.incubyte.Direction.*;

public class Chandrayaan {

    private int x, y, z;
    private Direction facingDirection;

    private int degree;
    private boolean isVertical=false;

    public Chandrayaan(int x, int y, int z, Direction facingDirection) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.facingDirection = facingDirection;
        setupDegree(facingDirection);
    }

    private void setupDegree(Direction facingDirection) {
        switch (facingDirection){
            case N:
                degree=0;
                break;
            case E:
                degree=90;
                break;
            case W:
                degree=270;
                break;
            case S:
                degree=180;
                break;
            default:
                isVertical=true;
                break;
        }

    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
        switch (degree){
            case 0:
                setFacingDirection(N);
                break;
            case 90:
                setFacingDirection(E);
                break;
            case 180:
                setFacingDirection(S);
                break;
            case 270:
                setFacingDirection(W);
                break;
        }
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

    public void moveForward() {
        updateCordinates(1);
    }


    public void moveBackward() {
        updateCordinates(-1);
    }

    private void updateCordinates(int i) {
        switch (getFacingDirection()){
            case N : case S : y+=i;
                break;
            case E : case W : x+=i;
                break;
            case Up: case Down: z+=i;

        }
    }

    public void turnLeft() {
       updateDegree(-90);
    }

    public void turnRight() {
        updateDegree(90);
    }

    private void updateDegree(int i) {
        isVertical=false;
        if(degree==0 && i<0){
            setDegree(270);
        }else if(degree==270 && i>0){
            setDegree(0);
        } else{
            int temp = getDegree()+i;
            setDegree(temp);
        }
    }

}
