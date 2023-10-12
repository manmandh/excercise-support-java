package ex2p10;
public class MyRectangle {
    private MyPoint  v1;
    private MyPoint v2;
    private MyPoint v3;
    private MyPoint v4;


    public MyRectangle(MyPoint v1, MyPoint v2, MyPoint v3, MyPoint v4) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        this.v4 = v4;
    }

    public MyRectangle(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3, y3);
        this.v4 = new MyPoint(x4, y4);
    }

    @Override
    public String toString() {
        return "MyRectangle[v1="+v1+", v2="+v2+", v3="+v3+", v4="+v4+"]";
    }

    public double getPerimeter() {
        return v1.distance(v2)+v1.distance(v3)+v3.distance(v4)+v2.distance(v4);
    }
}
