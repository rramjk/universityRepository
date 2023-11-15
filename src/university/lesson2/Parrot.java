package university.lesson2;

import java.util.*;

public class Parrot extends Bird{
    private String repeatText;
    private Random random = new Random();
    Parrot(String name, String color, int age, String repeatText){
        super(name, color, age);
        this.repeatText = repeatText;
    }
    public void sing(){
        for(int i = 0; i < random.nextInt(1, 5); i++){
            Object[] wordsArray = Arrays.stream(repeatText.split(" ")).map(a -> {
                if(a.length() == new Random().nextInt(10)){
                    String s = "";
                    List<String> list = Arrays.asList(a.split(""));
                    Collections.shuffle(list);
                    for(String str : list){
                        s += str;
                    }
                    return s;
                }else{
                    return a;
                }
            }).toArray();
            Arrays.stream(wordsArray).forEach(a -> System.out.print(a + " "));
            System.out.println();
        }
    }
}
