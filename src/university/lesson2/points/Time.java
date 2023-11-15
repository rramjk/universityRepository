package university.lesson2.points;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Time implements Attribute{
    private final SimpleDateFormat formater = new SimpleDateFormat("HH:mm");
    private final Date time = new Date();

    public Time() {
    }
    public String getTime(){
        return formater.format(time);
    }
    @Override
    public String attributeToString() {
        return "в " + formater.format(time);
    }

    public String toString(){
        return getTime();
    }

}
