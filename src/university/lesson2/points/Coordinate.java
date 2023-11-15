package university.lesson2.points;

public class Coordinate implements Attribute {
    private Double x;
    private Double y;
    private Double z;

    public Coordinate(double x) {
        setX(x);
    }

    public Coordinate(double x, double y) {
        this(x);
        setY(y);
    }

    public Coordinate(double x, double y, double z) {
        this(x, y);
        setZ(z);
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        if (x == null) throw new NullPointerException();
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        if (y == null) throw new NullPointerException();
        this.y = y;
    }

    public Double getZ() {
        return z;
    }

    public String getCoordinate(){
        return attributeToString();
    }

    public void setZ(Double z) {
        if (z == null) throw new NullPointerException();
        this.z = z;
    }

    @Override
    public String attributeToString() {
        StringBuilder s = new StringBuilder("Точка в координате {");
        if(z != null) s.append(x).append(";").append(y).append(";").append(z).append("}");
        else if(y != null) s.append(x).append(";").append(y).append("}");
        else s.append(x).append("}");

        return s.toString();
    }
}
