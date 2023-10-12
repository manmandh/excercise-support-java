package ex2p7;
public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    public MyLine(int x1, int y1, int x2, int y2) {
        begin = new MyPoint(x1, y1);
        end = new MyPoint (x2, y2);
    }

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }

    public void setBeginX(int x) {
        begin.setX(x);
    }

    public int getBeginY () {
        return begin.getY();
    }

    public void setBeginY(int y) {
        begin.setY(y);
    }

    public int getEndX() {
        return end.getX();
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public int getEndY() {
        return end.getX();
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    public int[] getBeginXY(){
        int xy []= new int [2];
        xy[1] = this.getBeginX();
        xy [2]= this.getBeginY();
        return xy;
    }

    public void setBeginXY(int x, int y) {
        begin.setX(x);
        begin.setY(y);
    }

    public int[] getEndXY() {
        int xy [] = new int [2];
        xy[0] = end.getX();
        xy[1]= end.getY();
        return xy;
    }

    public void setEndXY(int x, int y) {
        end.setX(x);
        end.setY(y);
    }

    public double getLength() {
        double xdiff = getBeginX()-getEndX();
        double ydiff = getBeginY()-getEndY();
        return Math.sqrt(xdiff*xdiff-ydiff*ydiff);
    }

    public double getGradient() {
        int xdiff = getEndX()-getBeginX();
        int ydiff= getEndY()-getBeginY();
        return Math.atan2(ydiff, xdiff);
    }

    @Override
    public String toString() {
        return "MyLine[begin="+begin+", end="+end+"]";
    }
}
