package university.lesson2;
// Блок 1
public class House {
    private final int floor;
    House(int floor){
        if(floor >= 1) {
            this.floor = floor;
        }else{
            throw new IllegalArgumentException("Дом должен иметь от 1 этажа!");
        }
    }

    public int getFloor() {
        return floor;
    }

    public String toString(){
        return (floor == 1) ? "дом с " + floor + " этажом" : "дом с " + floor + " этажами";
    }
}
