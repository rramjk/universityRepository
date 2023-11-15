package Ermakov.FW;
// Блок 1
public class Name {
    String name, familyName, fatherName;
    Name(String name){
        this.name = familyName;
    }
    Name(String familyName, String name){
        this.name = name;
        this.familyName = familyName;
    }
    Name(String familyName, String name, String fatherName){
        this.name = name;
        this.familyName = familyName;
        this.fatherName = fatherName;
    }

    public String toString(){
        if(familyName != null && fatherName != null){
            return familyName + " " + name + " " + fatherName;
        }else if(familyName != null){
            return familyName + " " + name;
        }else{
            return name;
        }
    }
}
