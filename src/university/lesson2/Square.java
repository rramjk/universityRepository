package university.lesson2;

public class Square {
    private Point3D startPoint;
    private int length;

    public Square(Point3D startPoint, int length) throws IllegalArgumentException{
        if(length >= 0){
            this.startPoint = startPoint;
            this.length = length;
        }else{
            throw new IllegalArgumentException("Длина не может быть отрицательной!");
        }
    }
    public Square(int x, int y, int length){
        this(new Point3D(x, y), length);
    }

    public void setLength(int length) throws IllegalArgumentException{
        if(length >= 0){
            this.length = length;
        }else{
            throw new IllegalArgumentException("Длина не может быть отрицательной!");
        }
    }

    public int getLength() {
        return length;
    }

    public BrokenLine getBrokenLine(){
        return new BrokenLine(startPoint,
                new Point3D(startPoint.getX()+length, startPoint.getY()),
                new Point3D(startPoint.getX()+length, startPoint.getY()-length),
                new Point3D(startPoint.getX(), startPoint.getY()-length));
    }
    @Override
    public String toString() {
        return "Square in point " + startPoint + " with length: " + length;
    }
}
