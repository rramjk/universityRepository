package university.programing;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Teacher c = new Teacher("Manya", "Matematika", 19);
        String d = c.vozrast();
        System.out.println(d);
    }
}
