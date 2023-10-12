package ex2p10;
public class MyPoint {
    private int x;
    private int y;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
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

    public int [] getXY() {
        int xy[]= new int [2];
        xy[0]= this.x;
        xy[1]= this.y;
        return xy;
    }

    public void setXY(int x, int y) {
        this.x =x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "("+x+", "+y+")";
    }

    public double distance( MyPoint another) {
        double xdiff = this.x-another.x;
        double ydiff = this.x - another.x;
        return Math.sqrt(xdiff*xdiff+ydiff*ydiff);
    }
}
