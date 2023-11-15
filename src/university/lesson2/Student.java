package university.lesson2;

import java.util.*;

public class Student {
    private String name;
    private List<Integer> marks = new ArrayList<>();
    Student(String name, Integer... marks){
        this(name, Arrays.asList(marks));
    }
    Student(String name,List<Integer> marks){
        this.name = name;
        for(Integer mark : marks){
            this.addMark(mark);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getMarks() {
        return new ArrayList(marks);
    }

    public void addMark(Integer mark){
        if(mark > 5 || mark < 2){
            throw new IllegalArgumentException("Оценки выставляются в диапозоне от 2 до 5!");
        }
        marks.add(mark);
    }

    public String toString(){
        return String.format("%s: %s", name, marks);
    }
}
