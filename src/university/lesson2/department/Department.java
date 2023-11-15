package university.lesson2.department;

import java.util.*;

public class Department {
    private String name;
    private Emploee director;
    private List<Emploee> listOfEmploes = new ArrayList<>();

    Department(String name, Emploee director) {
        this.name = name;
        this.director = director;
    }

    Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.equals("")){
            throw new IllegalArgumentException("Имя не может быть пустым!");
        }
        this.name = name;
    }

    public Emploee getDirector() {
        return director;
    }

    public List<Emploee> getListOfEmploes() {
        return new ArrayList<>(listOfEmploes);
    }

    public void setDirector(Emploee director) {
        if(director == null) throw new NullPointerException("Пустая ссылка директора!");
        if (listOfEmploes.contains(director)) {
            this.director = director;
        } else {
            throw new IllegalArgumentException("Директор должен работать в отделе!");
        }

    }

    public void addEmploee(Emploee emploee) {
        if(!listOfEmploes.contains(emploee) || (emploee != null) ){
            listOfEmploes.add(emploee);
        }
        if(emploee.getDepartment() != this) emploee.setDepartment(this);
    }
    public void deleteEmploee(Emploee emploee){
        if(emploee == null) throw new NullPointerException("Пустая ссылка сотрудника!");
        if(listOfEmploes.contains(this)) {
            listOfEmploes.remove(emploee);
            emploee.setDepartment(null);
        }
    }

    public String getEmploes() {
        if (listOfEmploes.size() == 0) {
            return "no emploes";
        } else {
            return Arrays.toString(listOfEmploes.toArray());
        }
    }
}
