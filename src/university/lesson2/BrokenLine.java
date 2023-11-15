package university.lesson2;

import java.util.ArrayList;
import java.util.Arrays;

public class BrokenLine {
    private ArrayList<Point> points;

    BrokenLine(Point... points) {
        this.points = (ArrayList<Point>) Arrays.asList(points);
    }

    public ArrayList<Point> getPoints() {
        return new ArrayList<>(points);
    }

    public Point getPointOf(int index) {
        if (index <= points.size() - 1 && index >= 0) {
            return points.get(index);
        } else {
            throw new IllegalArgumentException();
        }
    }


    public void addPoints(Point... point) {
        points.addAll(Arrays.asList(point));
    }

    @Override
    public String toString() {
        return "Линия с точками: " + points.toString();
    }
}
