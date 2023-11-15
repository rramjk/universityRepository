package university.lesson1;

public class Line {
    private Point pointOne, pointTwo;
    Line(Point pointOne, Point pointTwo){
        this.pointOne = pointOne;
        this.pointTwo = pointTwo;
    }

    public Point getPointOne() {
        return pointOne;
    }

    public void setPointOne(Point pointOne) {
        this.pointOne = pointOne;
    }

    public Point getPointTwo() {
        return pointTwo;
    }

    public void setPointTwo(Point pointTwo) {
        this.pointTwo = pointTwo;
    }

    @Override
    public String toString() {
        return "Линия от " + pointOne + " до " + pointTwo;
    }
}
