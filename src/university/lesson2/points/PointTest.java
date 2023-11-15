package university.lesson2.points;

import java.lang.reflect.InvocationTargetException;

public class PointTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException{
        Color color = new Color("черный");
        Coordinate coordinate = new Coordinate(3, -5);
        Time time = new Time();
        Comment comment = new Comment("новая");
        SmartPoint point = new SmartPoint(coordinate, color, time, comment);
        System.out.println(point);
        System.out.println(point.getParametr(Color.class, "Color"));
    }
}
