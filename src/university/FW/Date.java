package Ermakov.FW;

public class Date {
    int seconds;

    Date(int seconds) throws IllegalArgumentException{
        if(seconds >= 0){
            this.seconds = seconds;
        }else{
            throw new IllegalArgumentException("Время должно идти от начала суток. Быть больше нуля!");
        }
    }
    Date(int hours, int minutes, int seconds){
        if(hours > 0 && minutes > 0 && seconds > 0){
            this.seconds = seconds + (minutes*60) + (hours * 60 * 60);
        }else{
            throw new IllegalArgumentException("Время должно быть больше нуля!");
        }
    }

    private String Calculator(){
        String data = "";
        int h = seconds/3600%24;
        int m = seconds%3600/60;
        int s = seconds%3600%60;
        if(h < 10) data = data + "0" + h;
        else{
            data += h;
        }
        data += ":";
        if(m < 10) data = data + "0" + m;
        else{
            data += m;
        }
        data += ":";
        if(s < 10) data = data + "0" + s;
        else{
            data += s;
        }
        return data;

    }

    @Override
    public String toString() {
        String data = "";
        int h = seconds/3600%24;
        int m = seconds%3600/60;
        int s = seconds%3600%60;
        if(h < 10) data = data + "0" + h;
        else{
            data += h;
        }
        data += ":";
        if(m < 10) data = data + "0" + m;
        else{
            data += m;
        }
        data += ":";
        if(s < 10) data = data + "0" + s;
        else{
            data += s;
        }
        return data;
    }
}
