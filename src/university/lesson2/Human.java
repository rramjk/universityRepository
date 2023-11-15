package university.lesson2;

public class Human {
    private Name name;
    private Human father;
    private int height;

    public Human(Name name, int height) {
        if(height <= 500 && height > 0){
            this.name = name;
            this.height = height;
        }else{
            throw new IllegalArgumentException("Рост не может быть меньше нуля или больше 500!");
        }
    }
    public Human(Name name, int height, Human father) {
        this(name, height);
        this.father = father;
    }
    public Name getName() {
        return name;
    }
    public void setName(Name name) {
        if(name == null) throw new NullPointerException();
        this.name = name;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        if(height <=500 && height > 0){
            this.height = height;
        }else{
            throw new IllegalArgumentException("Рост не может быть меньше нуля или больше 500!");
        }
    }
    @Override
    public String toString() {
        String fullName;
        if(father == null){
            fullName = "Человек с Именем " + name + " и ростом " + height;
        }else{
            if(name.getSecondName() == null){
                name = new Name(father.getName().getSecondName(), name.getFirstName());
            }
            if(name.getFatherName() == null){
                name = new Name(father.getName().getSecondName(), name.getFirstName(), father.getName().getFirstName() + "ович");
            }
            fullName = "Человек с Именем " + name + ", отцом " + father.getName() + " и ростом " + height;
        }
        return fullName;
    }
}
