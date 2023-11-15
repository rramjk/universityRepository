package university.lesson2;
// Блок 1
public class Date {
    private int seconds = 0;

    Date(int seconds){
        if(seconds >= 0){
            this.seconds = seconds;
        }else{
            throw new IllegalArgumentException("Время должно быть от начала суток! (time > 0)");
        }
    }
    Date(int hours, int minutes, int seconds){
        this(seconds + (minutes*60) + (hours * 60 * 60));
    }

    @Override
    public String toString() {
        StringBuilder data = new StringBuilder();
        int[] timeParts = new int[3];
        timeParts[0] = this.seconds/3600%24; // H
        timeParts[1] = this.seconds%3600/60; // M
        timeParts[2] = this.seconds%3600%60; // S
        for(int part : timeParts){
            if(part<10){
                data.append("0").append(part).append(":");
                continue;
            }
            data.append(part).append(":");
        }
        data.deleteCharAt(data.length()-1);
        return data.toString();
    }
}
