package university.lesson2.department;

public class Emploee {
    private String name;
    private Department department;

    Emploee(String name, Department department) {
        if(name.equals("")){
            throw new IllegalArgumentException("Имя не может быть пустым!");
        } else if(department == null) throw new NullPointerException("Пустая ссылка департамента!");
        this.name = name;
        this.department = department;
        department.addEmploee(this);
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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        if(department == null){
            if(this.department != null) this.department.deleteEmploee(this);
            this.department = null;
        }else if(this.department == null){
            this.department = department;
            department.addEmploee(this);
        }else{
            this.department.deleteEmploee(this);
            this.department = department;
            this.department.addEmploee(this);
        }
    }

    @Override
    public String toString() {
        if (this != department.getDirector()) {
            return name + " working in " + department.getName() + ". Director: " + ((department.getDirector() != null)? department.getDirector().getName() : "no director");
        } else {
            return name + " director is " + department.getName();
        }

    }


}
