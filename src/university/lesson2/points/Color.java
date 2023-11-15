package university.lesson2.points;

public class Color implements Attribute{
    private String color;

    public Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color.isEmpty()) throw new IllegalArgumentException();
        this.color = color;
    }

    @Override
    public String attributeToString() {
        return new StringBuilder(color).delete(color.length()-2, color.length())  + "ого цвета";
    }

    @Override
    public String toString() {
        return color;
    }
}
