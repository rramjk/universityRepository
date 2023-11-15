package university.lesson2;

public class Test {
    public static void main(String[] args) {
        Parrot parrot = new Parrot("agata", "green", 12, "moscow is a capital of the world");
        parrot.sing();

        Point3D p = new Point3D(4, 5, 1, "зеленый");
        System.out.println(p);
    }
}
