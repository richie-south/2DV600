package rs222kn_assign1.Point;

import java.io.IOException;

/**
 * Created by richardsoderman on 2016-09-07.
 */
public class Point {
    private int x = 0;
    private int y = 0;

    public Point(){
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public boolean isEqualTo(Point point){
        return point.getY() == getY() && point.getX() == getX();
    }

    public double distanceTo(Point point){
        return Math.sqrt(Math.pow((point.getX() - x), 2) + Math.pow((point.getY() - y), 2));
    }

    public void move(int x, int y){
        this.x += x;
        this.y += y;
    }

    public void moveToXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "(" + x + "," + y + ")";
    }
}
