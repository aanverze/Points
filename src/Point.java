public class Point implements Movable {
    private double x;
    private double y;

    public Point() {
        x = 1.0;
        y = 1.0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point[" +
                "x=" + x +
                ",y=" + y +
                ']';
    }

    @Override
    public void moveUp() {
        y += 1;
    }