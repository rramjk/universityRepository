package university.lesson1;
// Блок 1
public class Point {
    private double X, Y;

    public Point(double X, double Y) {
        this.X = X;
        this.Y = Y;
    }

    public double getX() {
        return X;
    }

    public void setX(double x) {
        X = x;
    }

    public double getY() {
        return Y;
    }

    public void setY(double y) {
        Y = y;
    }

    @Override
    public String toString() {
        return "{" + X + ";" + Y + "}";
    }
}
