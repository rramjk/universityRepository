package university.lesson1;
// Блок 1
public class House {
    private int floor = 1;
    private String result;
    House(int floor){
        if(floor > 1) {
            this.floor = floor;
        }
    }

    public String toString(){
        result = (floor == 1) ? "дом с " + floor + " этажом" : "дом с " + floor + " этажами";
        return result;
    }
}
