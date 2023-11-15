package university.lesson2;

public class Cat {
    private String name;
    Cat(String name){
        this.name = name;
    }
    public void makeSound(){
        System.out.println(name + ": meow!");
    }
    public void makeSound(int count){
        makeSound();
        for(int i = 1; i < count; i++){
            System.out.print("-");
            System.out.print("meow");
        }
        System.out.print("!\n");
    }
}
