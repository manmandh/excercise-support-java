package ex2p8;
public class MyCircle {
    private MyPoint center;
    private int radius =1;

    public MyCircle() {
    }

    public MyCircle(int x, int y, int radius) {
        center = new MyPoint(x, y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius) {
        super();
        this.center = center;
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getCenterX() {
        return center.getX();
    }

    public void setCenterX(int x) {
        center.setX(x);
    }

    public int getCenterY() {
        return center.getY();
    }

    public void setCenterY(int y) {
        center.setY(y);
    }

    public int [] getCenterXY() {
        int xy[] = new int [2];
        xy[0] = center.getX();
        xy[1]= center.getY();
        return xy;
    }

    public void setCenterXY(int x, int y) {
        center.setX(x);
        center.setY(y);
    }

    @Override
    public String toString() {
        return "MyCircle[radius="+radius+", center="+center+"]";
    }

    public double getArea() {
        return radius*radius*Math.PI;
    }

    public double getCircumference() {
        return radius*2*Math.PI;
    }

    public double distance (MyCircle another) {
        int xdiff = this.getCenterX()-another.getCenterX();
        int ydiff = this.getCenterY()-another.getCenterY();
        return Math.sqrt(xdiff*xdiff+ydiff*ydiff);
    }
}
