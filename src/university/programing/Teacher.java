package university.programing;

public class Teacher {
    String name, predmet;
    int age;
    Teacher(String a, String b, int h){
        name = a;
        predmet = b;
        age = h;
    }
    String vozrast() {
        if (age > 50) {
            return ("staraya");
        } else {
            return ("molodaya");
        }
    }
}
