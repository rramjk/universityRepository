package university.lesson1;
// Блок 1
public class Name {
    private String firstName, secondName, fatherName;
    Name(String firstName){
        this.firstName = firstName;
    }
    Name(String secondName, String firstName){
        this(firstName);
        this.secondName = secondName;
    }
    Name(String secondName, String firstName, String fatherName){
        this(secondName, firstName);
        this.fatherName = fatherName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
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
