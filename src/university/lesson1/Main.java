package university.lesson1;

public class Main {
    public static void main(String[] args) {
        Point pointOne = new Point(1, 5);
        Point pointTwo = new Point(2.2, 3.5);
        Point pointThree = new Point(0.4, -3.1);
        System.out.printf("%s\n%s\n%s\n", pointOne, pointTwo, pointThree);

        Name firstName = new Name("Клеопатра");
        Name fullName = new Name("Пушкин", "Александ", "Сергеевич");
        Name firstSecondName = new Name("Маяковский", "Владимир");
        System.out.printf("%s\n%s\n%s\n", firstName, fullName, firstSecondName);

        Human firstHuman = new Human(firstName, 152);
        Human secondHuman = new Human(fullName, 167);
        Human thirdHuman = new Human(firstSecondName, 189);
        System.out.printf("%s\n%s\n%s\n", firstHuman, secondHuman, thirdHuman);

        System.out.println(new Date(12000));
        System.out.println(new Date(176800));
        System.out.println(new House(1));
        System.out.println(new House(5));
        System.out.println(new House(25));
        System.out.println(new House(0));
        Line firstLine = new Line(new Point(1, 3), new Point(23, 8));
        System.out.println(firstLine);
        Line secondLine = new Line(new Point(5, 10), new Point(25, 10));
        System.out.println(secondLine);
        Line thirdLine = new Line(firstLine.getPointOne(), secondLine.getPointTwo());
        System.out.println(thirdLine);

        firstLine.getPointOne().setX(5);
        firstLine.getPointOne().setY(5);
        secondLine.getPointTwo().setX(10);
        secondLine.getPointTwo().setY(10);
        System.out.println(thirdLine);
        firstLine.setPointOne(new Point(0, 0));
        System.out.println(thirdLine);

        Human fatherOld = new Human(new Name("Чудов", "Иван"), 155);
        Human fatherSecond = new Human(new Name("Чудов", "Петр"), 165, fatherOld);
        Human son = new Human(new Name("Борис"), 175, fatherSecond);
        System.out.println(fatherOld);
        System.out.println(fatherSecond);
        System.out.println(son);


    }

}
