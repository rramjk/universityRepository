package university.lesson2;
// Блок 1
public class Name {
    private String firstName, secondName, fatherName;
    Name(String firstName){
        if(!firstName.equals("")){
            this.firstName = firstName;
        }else{
            throw new IllegalArgumentException("Пустая строка!");
        }

    }
    Name(String secondName, String firstName){
        this(firstName);
        if(!secondName.equals("")){
            this.secondName = secondName;
        }else{
            throw new IllegalArgumentException("Пустая строка!");
        }
    }
    Name(String secondName, String firstName, String fatherName){
        this(secondName, firstName);
        if(!fatherName.equals("")){
            this.fatherName = fatherName;
        }else{
            throw new IllegalArgumentException("Пустая строка!");
        }
    }

    public String getFirstName() {
        if(firstName != null){
            return firstName;
        }else{
            throw new NullPointerException("Параметр равен null!");
        }
    }
    public String getSecondName() {
        if(secondName != null){
            return secondName;
        }else{
            throw new NullPointerException("Параметр равен null!");
        }
    }
    public String getFatherName() {
        if(fatherName != null){
            return fatherName;
        }else{
            throw new NullPointerException("Параметр равен null!");
        }
    }

    public String toString(){
        String fullName;
        if(secondName != null && fatherName != null){
            fullName = secondName + " " + firstName + " " + fatherName;
        }else if(secondName != null){
            fullName = secondName + " " + firstName;
        }else{
            fullName = firstName;
        }
        return fullName;
    }
}
