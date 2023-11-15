package Ermakov.FW;
// Блок 1
public class House {
    int floor = 1;
    String res;
    House(int floor){
        if(floor > 1) {
            this.floor = floor;
        }
    }

    public String toString(){
        if(floor == 1){
            res = "дом с " + floor + " этажом";
        }else{
            res = "дом с " + floor + " этажами";
        }
        return res;
    }
}
