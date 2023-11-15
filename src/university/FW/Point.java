package university.FW;

abstract class Point {
    private double x, y;
    public Point(){
        x = y = 0;
    }

    public Point(double X, double Y) {
        this.x = X;
        this.y = Y;
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
        return "{" + x + ";" + y + "}";
    }
}
