package university.FW;

public class Line {
    private Point3D pointOne, pointTwo;

    Line(Point pointOne, Point pointTwo) {
        if (pointOne == null || pointTwo == null) {
            throw new NullPointerException("Точка имеет пустое значение!");
        }
        this.pointOne = new Point3D(pointOne.getX(), pointOne.getY());
        this.pointTwo = new Point3D(pointTwo.getX(), pointTwo.getY());
    }

    Line(double x1, double y1, double x2, double y2) {
        this.pointOne = new Point3D(x1, y1);
        this.pointTwo = new Point3D(x2, y2);
    }


    public Point getPointOne() {
        return pointOne;
    }

    public void setPointOne(int x, int y) {
        this.pointOne = new Point3D(x, y);
    }

    public Point getPointTwo() {
        return pointTwo;
    }

    public void setPointTwo(int x, int y) {
        this.pointTwo = new Point3D(x, y);
    }

    @Override
    public String toString() {
        return "Линия от " + pointOne + " до " + pointTwo;
    }
}
