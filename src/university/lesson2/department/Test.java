package university.lesson2.department;

public class Test {
    public static void main(String[] args) {
        Department IT = new Department("IT");
        Emploee emploee = new Emploee("Vadim", IT);
        Emploee emploee1 = new Emploee("Vasya", IT);
        Emploee emploeeDirector = new Emploee("Vladislav", IT);

        IT.setDirector(emploeeDirector);
        System.out.println(emploee.getDepartment().getEmploes());
    }
}
