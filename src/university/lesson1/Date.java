package university.lesson1;
// Блок 1
public class Date {
    private int seconds;

    Date(int seconds){
        this.seconds = seconds;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
    private String timeCalculation(){
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

    @Override
    public String toString() {
        return timeCalculation();
    }
}
