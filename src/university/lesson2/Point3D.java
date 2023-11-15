package university.lesson2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Point3D extends Point {
    private Double z;
    private Date time = new Date(); // настоящее время
    private String color;
    private SimpleDateFormat formater = new SimpleDateFormat("HH:mm:ss"); //шаблон вывода времени
    public Point3D(){
        super();
        z = (double) 0;
    }
    public Point3D(double x, double y) {
        super(x, y);
    }
    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }
    public Point3D(double x, double y, double z, String color) {
        super(x, y);
        this.z = z;
        this.color = color;
    }
    public Double getZ(){
        return z;
    }

    @Override
    public String toString() {
        String s = "";
        if(z == null){
            s += "Точка в координате {" + getX() + "," + getY() + "} в " + formater.format(time);
        }else{
            s += "Точка в координате {" + getX() + "," + getY() + "," + getZ() + "} в " + formater.format(time);
        }
        if(!(color == null)) s += ", цвета: " + color;
        return s;
    }
}
